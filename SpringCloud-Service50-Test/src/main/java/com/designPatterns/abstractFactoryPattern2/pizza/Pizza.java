package com.designPatterns.abstractFactoryPattern2.pizza;

import com.designPatterns.abstractFactoryPattern2.material.rule.Cheese;
import com.designPatterns.abstractFactoryPattern2.material.rule.Sauce;
import com.designPatterns.abstractFactoryPattern2.material.rule.Veggies;

public abstract class Pizza {
	// pizza 名稱
	public String name;
	// pizza 原料
	public Sauce sauce;
	public Veggies veggies;
	public Cheese cheese;

	// 把這個方法宣告成抽象，以便讓次類別
	// 使用不同工廠的原料
	abstract public void prepare();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 其他方法如 bake(), cut() 都不變，
	// 只有 prepare() 要改變

}
