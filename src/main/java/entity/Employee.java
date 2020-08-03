package entity;

import java.util.Arrays;

public class Employee {
 private Integer id;
 private Integer eid;
 private String cardid;
 private String name;
 private String gender;
 private String address;
 private String title;
 private String phone;
 private String department;
 private byte[] pic;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Integer getEid() {
	return eid;
}
public void setEid(Integer eid) {
	this.eid = eid;
}
public String getCardid() {
	return cardid;
}
public void setCardid(String cardid) {
	this.cardid = cardid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public byte[] getPic() {
	return pic;
}
public void setPic(byte[] pic) {
	this.pic = pic;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", eid=" + eid + ", cardid=" + cardid + ", name=" + name + ", gender=" + gender
			+ ", address=" + address + ", title=" + title + ", phone=" + phone + ", department=" + department + ", pic="
			+ Arrays.toString(pic) + "]";
}
 
 
}
