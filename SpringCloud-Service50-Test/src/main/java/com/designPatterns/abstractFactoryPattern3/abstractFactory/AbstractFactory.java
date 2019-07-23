package com.designPatterns.abstractFactoryPattern3.abstractFactory;

import com.designPatterns.abstractFactoryPattern3.type.Audi;
import com.designPatterns.abstractFactoryPattern3.type.BMW;

public abstract class AbstractFactory {

	public abstract Audi createAudi();

	public abstract BMW createBMW();
}
