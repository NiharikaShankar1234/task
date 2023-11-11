package com.LooseCoupling;

public class Student {

	public static void main(String [] args) {
		Exam e1=new Online();
		Exam e2=new Offline();
		
		ChooseModeofExam em = new ModeOfExam(e1);
		em.Examination();
		
		/*e1.exam_mode();
		e2.exam_mode();*/
	}
}
