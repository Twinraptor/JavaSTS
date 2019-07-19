package com.codingdojo.phone;

public class IPhone extends Phone implements Ringable {
    private String unlock = "facial recognition";
	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return this.getRingTone();
    }
    @Override
    public String unlock() {
    	return ("Unlocking via "+ this.getUnlock());
    }
    @Override
    public void displayInfo() {
        System.out.println(this.getCarrier());           
    }
	public String getUnlock() {
		return unlock;
	}
	public void setUnlock(String unlock) {
		this.unlock = unlock;
	}
}
