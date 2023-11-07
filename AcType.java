package com.code;

public enum AcType {
	SAVING(5000),CURRENT(221),FD(500),DMAT(1000),LOAN(2500),NRE(3000);
	private double minBalance;
	//private constructor for AcType
	private AcType(double minBalance) {
		this.minBalance=minBalance;
	}
	public double getMinBalance() {
		return minBalance;
	}
	@Override
	public String toString() {
		return name().toLowerCase()+" min balance "+minBalance;
	}





}
