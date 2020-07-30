package service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.CfDetailDao;
import dao.CfHeadDao;
import dao.DrugDao;
import entity.CfDetail;
import entity.CfHead;
import entity.CfHeadCondition;
import entity.Drug;
@Service
public class CfServ {
	@Resource
	private CfHeadDao cfhd;
	@Resource
	private CfDetailDao cdd;
	@Resource
	private DrugDao dd;
	public List<CfHead> getAll(){
		return cfhd.findAll();
	}
	
	public List<CfHead> get(CfHeadCondition condition){
		
		return cfhd.find(condition);
	}
	public List<String> getDoctors(){
		return cfhd.findDoctors();
	}
	public List<Drug> getDrugs(Drug drug){
		return dd.findByCondition(drug);
	}
	public List<CfDetail> findCfDetail(CfDetail condition){
		return cdd.find(condition);
	}
	public List<Map<String,Object>> findCftypeTongji(CfHeadCondition condition){
		return cfhd.findCftypeTongji(condition);
	}
	
}
