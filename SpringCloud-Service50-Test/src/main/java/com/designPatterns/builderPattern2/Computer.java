package com.designPatterns.builderPattern2;

public abstract class Computer {

	private String CPU;

	private String Mainboard;

	private String HD;

	private String ComputerName;

	private String ComputerOS;

	public Computer(String name, String os) {
		this.ComputerName = name;
		this.ComputerOS = os;
	}

	public String getCPU() {
		return CPU;
	}

	public void setCPU(String cPU) {
		CPU = cPU;
	}

	public String getMainboard() {
		return Mainboard;
	}

	public void setMainboard(String mainboard) {
		Mainboard = mainboard;
	}

	public String getHD() {
		return HD;
	}

	public void setHD(String hD) {
		HD = hD;
	}

	public String getComputerName() {
		return ComputerName;
	}

	public void setComputerName(String computerName) {
		ComputerName = computerName;
	}

	public String getComputerOS() {
		return ComputerOS;
	}

	public void setComputerOS(String computerOS) {
		ComputerOS = computerOS;
	}

}
