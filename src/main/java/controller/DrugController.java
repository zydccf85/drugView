package controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.DrugDao;
import entity.Drug;

@Controller
@RequestMapping("/drug")
public class DrugController implements Serializable {
	private static final long serialVersionUID = 100L;
	@Resource
	private DrugDao dd ;
	
	@RequestMapping("/getDrugName.do")
	@ResponseBody
	public List<Drug> getDrugName( String searchCode){
		System.out.println(searchCode);
		return dd.fingDrugName(searchCode);
	}
	@RequestMapping("/getAllDrugName.do")
	@ResponseBody
	public List<Drug> getAllDrugName(){
		return dd.fingDrugName(null);
	}
	@RequestMapping("/getDrugs.do")
	@ResponseBody
	public List<Drug> getDrugs(Drug drug){
		return dd.findByCondition(drug);
	}
	
	
}
