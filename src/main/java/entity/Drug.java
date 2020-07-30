package entity;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;
public class Drug implements Serializable {
	private String code;
	private String name;
	private String spci;
	private String form;
	private String address;
	private String unit;
	private Double unitPrice;
	private String searchCode;
	private String cate;
	private String cata;
	public String getCate() {
		return cate;
	}
	public void setCate(String cate) {
		this.cate = cate;
	}
	public String getCata() {
		return cata;
	}
	public void setCata(String cata) {
		this.cata = cata;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpci() {
		return spci;
	}
	public void setSpci(String spci) {
		this.spci = spci;
	}
	public String getForm() {
		return form;
	}
	public void setForm(String form) {
		this.form = form;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public Double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getSearchCode() {
		return searchCode;
	}
	public void setSearchCode(String searchCode) {
		this.searchCode = searchCode;
	}
	@Override
	public String toString() {
		return "Drug [code=" + code + ", name=" + name + ", spci=" + spci + ", form=" + form + ", address=" + address
				+ ", unit=" + unit + ", unitPrice=" + unitPrice + ", searchCode=" + searchCode + ", cate=" + cate
				+ ", cata=" + cata + "]";
	}
	
}
