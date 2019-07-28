package com.omicron.sodevrsapp.ui.model.response;

public class SmartElectroniqueResponseModel extends ElectroniqueResponseModel {

	private String os;
	private String cpu;
	private String ram;
	private String stockage;
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getStockage() {
		return stockage;
	}
	public void setStockage(String stockage) {
		this.stockage = stockage;
	}
	
	
}
