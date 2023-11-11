package com.Coupling;

public class Travel {

	public void start() {
		//object 
		
		Bus b1  = new Bus();
		b1.start();
		Train t1 = new Train();//travel must know the implementation of bus and train
		t1.start();
		
	}
	}
