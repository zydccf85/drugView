 package controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import entity.CfDetail;
import entity.CfHead;
import entity.CfHeadCondition;
import entity.Drug;
import service.CfServ;

 @Controller
 @RequestMapping("/api")
public class panelController {
    @Resource
    private CfServ cfs;
//    @InitBinder
//    public void initBinder(WebDataBinder binder) {
//    	BindingResult br = binder.getBindingResult();
//     
//    }
    @ResponseBody
	@GetMapping("/CfHead.do")
	public List<CfHead>  getDrug(CfHeadCondition condition) {
		System.out.println(condition);
		List<CfHead> data = this.cfs.get(condition);
//		System.out.println(data.get(0).toString());
//		System.out.println("总记录数为"+data.size());
		return data;
	}
    @ResponseBody
   	@GetMapping("/CfHeadCftype.do")
    public List<Map<String,Object>> CfHeadCftype(CfHeadCondition condition){
    	return cfs.findCftypeTongji(condition);
    }
    @GetMapping("/getDoctors.do")
    @ResponseBody
    public List<String> getDoctors(){
    	System.out.print("getdocotrs");
    	return cfs.getDoctors();
    }
    @GetMapping("/getDrug.do")
    @ResponseBody
    public List<Drug> getDrug(Drug drug){
    	System.out.print(drug);
    	return cfs.getDrugs(drug);
    }
    @GetMapping("/CfDetail.do")
    @ResponseBody
    public List<CfDetail> getCfDetail(CfDetail condition){
    	return cfs.findCfDetail(condition);
    }
    @PostMapping("/dFileLoad.do")
    @ResponseBody
    public String dFileLoad(@RequestParam("dUploadFile") MultipartFile file,HttpServletRequest request){
    	String realpath = request.getServletContext().getRealPath("/");
    	System.out.println(realpath);
 	   try {
		file.transferTo(new File(realpath+file.getOriginalFilename()));
	} catch (IllegalStateException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 	   return "ccf";
     }
	@ExceptionHandler
	public String excHandle(Exception e,HttpServletRequest req) {
		//m.addAttribute("err", "ccf");
		req.setAttribute("err", "不能");
		return "error";
	}
}
