package com.tnsif.daynine.covariantoverrinding;

public class ClassD extends ClassC {

	@Override
	public String getType() {
		return "ClassD";
	}
	
	@Override
	public ClassD getObject() {
		return this;
	}
	
}
