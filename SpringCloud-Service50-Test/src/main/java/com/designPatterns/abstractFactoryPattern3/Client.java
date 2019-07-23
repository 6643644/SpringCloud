package com.designPatterns.abstractFactoryPattern3;

import com.designPatterns.abstractFactoryPattern3.abstractFactory.AbstractFactory;
import com.designPatterns.abstractFactoryPattern3.factory.JeepFactory;
import com.designPatterns.abstractFactoryPattern3.factory.SUVFactory;
import com.designPatterns.abstractFactoryPattern3.type.Audi;
import com.designPatterns.abstractFactoryPattern3.type.BMW;

public class Client {

	public static void main(String[] args) {
		AbstractFactory factorySUV = new SUVFactory();
		System.out.println("----- SUV Factory -----");

		Audi suvAudi = factorySUV.createAudi();
		System.out.println(suvAudi.getBrand() + "的" + suvAudi.getType());

		BMW suvBMW = factorySUV.createBMW();
		System.out.println(suvBMW.getBrand() + "的" + suvBMW.getType());

		AbstractFactory factoryJeep = new JeepFactory();
		System.out.println("----- Jeep Factory -----");

		Audi jeepAudi = factoryJeep.createAudi();
		System.out.println(jeepAudi.getBrand() + "的" + jeepAudi.getType());

		BMW jeepBMW = factoryJeep.createBMW();
		System.out.println(jeepBMW.getBrand() + "的" + jeepBMW.getType());

	}

}
