package com.jk.classes;

public abstract class Bike {
	public String bikeID;
	public String engineCC;
	
	public String getBikeID() {
		return bikeID;
	}

	public void setBikeID(String bikeID) {
		System.out.println(bikeID);
		this.bikeID = bikeID;
	}

	public String getEngineCC() {
		return engineCC;
	}

	public void setEngineCC(String engineCC) {
		System.out.println(engineCC);
		this.engineCC = engineCC;
	}
	
	public abstract void drive();
}
