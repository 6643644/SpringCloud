package com.designPatterns.abstractFactoryPattern3.factory;

import com.designPatterns.abstractFactoryPattern3.abstractFactory.AbstractFactory;
import com.designPatterns.abstractFactoryPattern3.product.audi.AudiSUV;
import com.designPatterns.abstractFactoryPattern3.product.bmw.BMWSUV;
import com.designPatterns.abstractFactoryPattern3.type.Audi;
import com.designPatterns.abstractFactoryPattern3.type.BMW;

public class SUVFactory extends AbstractFactory {

	@Override
	public Audi createAudi() {
		return new AudiSUV();
	}

	@Override
	public BMW createBMW() {
		return new BMWSUV();
	}
}
