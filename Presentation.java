package com.Couplinggift;

public class Presentation implements Examination
{
	private Examination examination;
	Presentation(Examination examination){
		this .examination=examination;
	}
	public void gift() {
		examination.gift();
	}

	/*@Override
	public void gift() {
		// TODO Auto-generated method stub
		
	}*/

}