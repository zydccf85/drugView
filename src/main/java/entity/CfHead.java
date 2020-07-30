package entity;

import java.io.Serializable;
import java.util.List;

public class CfHead implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String cftype;
	private String hospital;
	private String department;
	private String cardid;
	private String pid;
	private String patient;
	private String gender;
	private String  age;
	private String doctor;
	private String disease;
	private String disease2;
	private String feibie;
	private String phone;
	private String address;
	private Double totalprice;
	private String opertime;
	private String did;
	private String enable;
	private List<CfDetail> cfDetail;
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<CfDetail> getCfDetail() {
		return cfDetail;
	}
	public void setCfDetail(List<CfDetail> cfDetail) {
		this.cfDetail = cfDetail;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCftype() {
		return cftype;
	}
	public void setCftype(String cftype) {
		this.cftype = cftype;
	}
	public String getHospital() {
		return hospital;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}
	public String getCardid() {
		return cardid;
	}
	public void setCardid(String cardid) {
		this.cardid = cardid;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPatient() {
		return patient;
	}
	public void setPatient(String patient) {
		this.patient = patient;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getDisease2() {
		return disease2;
	}
	public void setDisease2(String disease2) {
		this.disease2 = disease2;
	}
	public String getFeibie() {
		return feibie;
	}
	public void setFeibie(String feibie) {
		this.feibie = feibie;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(Double totalprice) {
		this.totalprice = totalprice;
	}
	public String getOpertime() {
		return opertime;
	}
	public void setOpertime(String opertime) {
		this.opertime = opertime;
	}
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getEnable() {
		return enable;
	}
	public void setEnable(String enable) {
		this.enable = enable;
	}
	@Override
	public String toString() {
		return "CfHead [id=" + id + ", cftype=" + cftype + ", hospital=" + hospital + ", department=" + department
				+ ", cardid=" + cardid + ", pid=" + pid + ", patient=" + patient + ", gender=" + gender + ", age=" + age
				+ ", doctor=" + doctor + ", disease=" + disease + ", disease2=" + disease2 + ", feibie=" + feibie
				+ ", phone=" + phone + ", address=" + address + ", totalprice=" + totalprice + ", opertime=" + opertime
				+ ", did=" + did + ", enable=" + enable + ", cfDetail=" + cfDetail ;
	}

	

}
