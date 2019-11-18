package com.example.model;

public class Province {
	
	//创建三个成员变量（变量方法）
	private int id; //省份编号
	private String provinceName;  //省份名
	private String provinceCode;  
	
	public int getId() {
		return id; 
	}
	
	public void setId(int id) {
		this.id = id; 
	} 
	
	public String getProvinceName() {
		return provinceName;
	} 
	
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName; 
	}
	
	public String getProvinceCode() { 
		return provinceCode;
	} 
	
	public void setProvinceCode(String provinceCode) { 
		this.provinceCode = provinceCode; 
	} 
	
}
