package com.designPatterns.abstractFactoryPattern3.factory;

import com.designPatterns.abstractFactoryPattern3.abstractFactory.AbstractFactory;
import com.designPatterns.abstractFactoryPattern3.product.audi.AudiJeep;
import com.designPatterns.abstractFactoryPattern3.product.bmw.BMWJeep;
import com.designPatterns.abstractFactoryPattern3.type.Audi;
import com.designPatterns.abstractFactoryPattern3.type.BMW;

public class JeepFactory extends AbstractFactory {

	@Override
	public Audi createAudi() {
		return new AudiJeep();
	}

	@Override
	public BMW createBMW() {
		return new BMWJeep();
	}
}
