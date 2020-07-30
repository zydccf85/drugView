package entity;

import java.io.Serializable;

public class CfDetail implements Serializable {
	public Integer id;
	public Integer gid;
	public String drug;
	public String spci;
	public String cishu;
	public String yongliang;
	public String danwei;
	public String yongfa;
	public Double quantity;
	public String unit;
	public Double unitprice;
	public String opertime;
	public Integer enable;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getDrug() {
		return drug;
	}
	public void setDrug(String drug) {
		this.drug = drug;
	}
	public String getSpci() {
		return spci;
	}
	public void setSpci(String spci) {
		this.spci = spci;
	}
	public String getCishu() {
		return cishu;
	}
	public void setCishu(String cishu) {
		this.cishu = cishu;
	}
	public String getYongliang() {
		return yongliang;
	}
	public void setYongliang(String yongliang) {
		this.yongliang = yongliang;
	}
	public String getDanwei() {
		return danwei;
	}
	public void setDanwei(String danwei) {
		this.danwei = danwei;
	}
	public String getYongfa() {
		return yongfa;
	}
	public void setYongfa(String yongfa) {
		this.yongfa = yongfa;
	}
	public Double getQuantity() {
		return quantity;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public Double getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(Double unitprice) {
		this.unitprice = unitprice;
	}
	public String getOpertime() {
		return opertime;
	}
	public void setOpertime(String opertime) {
		this.opertime = opertime;
	}
	public Integer getEnable() {
		return enable;
	}
	public void setEnable(Integer enable) {
		this.enable = enable;
	}
	@Override
	public String toString() {
		return "CfDetail [id=" + id + ", gid=" + gid + ", drug=" + drug + ", spci=" + spci + ", cishu=" + cishu
				+ ", yongliang=" + yongliang + ", danwei=" + danwei + ", yongfa=" + yongfa + ", quantity=" + quantity
				+ ", unit=" + unit + ", unitprice=" + unitprice + ", opertime=" + opertime + ", enable=" + enable + "]";
	}
	
}
