package service;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import entity.CfDetail;
import entity.CfHead;

public class ImportCfServ {

	public  Document load(String filename) {  
	    Document document = null;  
	    try {  
	        SAXReader saxReader = new SAXReader();  
	        document = saxReader.read(new File(filename)); // 读取XML文件,获得document对象  
	    } catch (Exception ex) {  
	        ex.printStackTrace();  
	    }  
	    return document;  
	}
	public List<CfHead> readCf(String filename) {
		Document doc = load(filename);
		Element root = doc.getRootElement();
		List<Element> es = root.elements("NewDataSet");
		List<CfHead> cfheads = new ArrayList<CfHead>();
		es.forEach(item->{
			Element zd = item.element("诊断信息");
			CfHead cf = new CfHead();
			cf.setCftype(zd.elementText("处方类型名称"));
			cf.setHospital(zd.elementText("单位名称"));
			cf.setCardid(zd.elementText("卡号"));
			cf.setPid(zd.elementText("门诊号"));
			cf.setPatient(zd.elementText("姓名"));
			cf.setGender(zd.elementText("性别"));
			cf.setAge(zd.elementText("年龄"));
			cf.setDepartment(zd.elementText("科室"));
			cf.setDoctor(zd.elementText("医生"));
			cf.setDisease(zd.elementText("诊断"));
			cf.setDisease2(zd.elementText("辅助信息"));
			cf.setFeibie(zd.elementText("费别"));
			cf.setPhone(zd.elementText("联系电话"));
			cf.setAddress(zd.elementText("居住地址"));
			cf.setTotalprice(Double.parseDouble(zd.elementText("总金额")));
			String opertime = zd.elementText("操作时间");
			cf.setOpertime(opertime);
			cf.setDid(zd.elementText("身份证号"));
			//处方明细
			List<Element> mx = item.elements("处方信息");
			List<CfDetail> des = new ArrayList<CfDetail>();
			mx.forEach(el->{
				CfDetail de = new CfDetail();
				de.setOpertime(opertime);
				de.setGid(Integer.parseInt(el.elementText("组号")));
				de.setDrug(el.elementText("名称"));
				de.setSpci(el.elementText("规格"));
				de.setCishu(el.elementText("每日次数"));
				de.setYongliang(el.elementText("每次用量"));
				de.setDanwei(el.elementText("用量单位"));
				de.setYongfa(el.elementText("用法"));
				de.setQuantity(Double.parseDouble(el.elementText("数量")));
				de.setUnit(el.elementText("单位"));
				de.setUnitprice(Double.parseDouble(el.elementText("单价")));
				des.add(de);
			});
			cf.setCfDetail(des);
			cfheads.add(cf);
			
		});
		System.out.println(cfheads.size());
		return cfheads;
	}
	@Test
	public void test() {
		int count = readAllCf("L:\\chufang").size();
		System.out.println(count);
	}
	public List<CfHead> readAllCf(String directoryName){
		File dic = new File(directoryName);
		List<CfHead> li = new ArrayList<CfHead>();
		if(dic.isDirectory()) {
			File[] files = 
			dic.listFiles(new FilenameFilter() {
				
				@Override
				public boolean accept(File dir, String name) {
					System.out.println(name);
					return true;
				}
			});
			for(File f : files) {
				String filename = f.getAbsolutePath();
				li.addAll(readCf(filename));
			}
		}
		return li;
	}
	//切分list
	 private List<List<CfHead>> splitList(List<CfHead> list , int groupSize){
	        int length = list.size();
	        // 计算可以分成多少组
	        int num = ( length + groupSize - 1 )/groupSize ; // TODO 
	        List<List<CfHead>> newList = new ArrayList<>(num);
	        for (int i = 0; i < num; i++) {
	            // 开始位置
	            int fromIndex = i * groupSize;
	            // 结束位置
	            int toIndex = (i+1) * groupSize < length ? ( i+1 ) * groupSize : length ;
	            newList.add(list.subList(fromIndex,toIndex)) ;
	        }
	        return  newList ;
	    }
}
