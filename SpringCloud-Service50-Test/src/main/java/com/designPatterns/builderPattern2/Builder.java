package com.designPatterns.builderPattern2;

public abstract class Builder {

	// 安裝CPU
	public abstract void buildCPU(String cpu);

	// 安裝主機板
	public abstract void buildMainboard(String main);

	// 安裝硬碟
	public abstract void buildHD(String hd);

	// 獲得組裝好的電腦
	public abstract Computer GetComputer();
}
