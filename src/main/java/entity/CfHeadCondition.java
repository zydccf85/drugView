package entity;

public class CfHeadCondition extends CfHead {
	private String beginTime;
	private String endTime;
	public String getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	@Override
	public String toString() {
		return "CfHeadCondition [beginTime=" + beginTime + ", endTime=" + endTime + ", getBeginTime()=" + getBeginTime()
				+ ", getEndTime()=" + getEndTime() + ", getCfDetail()=" + getCfDetail() + ", getId()=" + getId()
				+ ", getCftype()=" + getCftype() + ", getHospital()=" + getHospital() + ", getCardid()=" + getCardid()
				+ ", getPid()=" + getPid() + ", getPatient()=" + getPatient() + ", getAge()=" + getAge()
				+ ", getDoctor()=" + getDoctor() + ", getDisease()=" + getDisease() + ", getDisease2()=" + getDisease2()
				+ ", getFeibie()=" + getFeibie() + ", getPhone()=" + getPhone() + ", getAddress()=" + getAddress()
				+ ", getTotalprice()=" + getTotalprice() + ", getOpertime()=" + getOpertime() + ", getDid()=" + getDid()
				+ ", getEnable()=" + getEnable() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
}
