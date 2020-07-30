package entity;

import java.io.Serializable;

public class TongJi implements Serializable {
	private Integer rn;
	private String range;
	private String doctor;
	private Double maxprice;
	private Integer maxpricecount;
	private Double minprice;
	private Integer minpricecount;
	private Integer total;
	private Double totalprice;
	public Integer getRn() {
		return rn;
	}
	public void setRn(Integer rn) {
		this.rn = rn;
	}
	public String getRange() {
		return range;
	}
	public void setRange(String range) {
		this.range = range;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	public Double getMaxprice() {
		return maxprice;
	}
	public void setMaxprice(Double maxprice) {
		this.maxprice = maxprice;
	}
	public Integer getMaxpricecount() {
		return maxpricecount;
	}
	public void setMaxpricecount(Integer maxpricecount) {
		this.maxpricecount = maxpricecount;
	}
	public Double getMinprice() {
		return minprice;
	}
	public void setMinprice(Double minprice) {
		this.minprice = minprice;
	}
	public Integer getMinpricecount() {
		return minpricecount;
	}
	public void setMinpricecount(Integer minpricecount) {
		this.minpricecount = minpricecount;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(Double totalprice) {
		this.totalprice = totalprice;
	}
	@Override
	public String toString() {
		return "TongJi [rn=" + rn + ", range=" + range + ", doctor=" + doctor + ", maxprice=" + maxprice
				+ ", maxpricecount=" + maxpricecount + ", minprice=" + minprice + ", minpricecount=" + minpricecount
				+ ", total=" + total + ", totalprice=" + totalprice + "]";
	}
	
	
}
