package com.tns.day4;

public class Base {
	int varDefault=10;
	public int varPublic=20;
	public int varPrivate=30;
	protected int  varProtected=40;
	
	void methodDefault()
	{
		System.out.println("Default Variable"+varDefault);
		System.out.println("Default Method");
	}
	public void methodPublic()
	{
		System.out.println("Public Variable"+varPublic);
		System.out.println("Public Method");
	}
	private void methodPrivate()
	{
		System.out.println("Private Variable"+varPrivate);
		System.out.println("Private Method");
	}
	public void methodProtected()
	{
		System.out.println("Protected Variable"+varProtected);
		System.out.println("Protected Method");
	}

}
