package com.LooseCoupling;

public class ModeOfExam implements ChooseModeofExam {

	//object sending
	private Exam exam;
	
	// setting value 
	public ModeOfExam(Exam exam) {
		this.exam=exam;
	}
	@Override
	public void Examination() {
		exam.exam_mode();
		
	}

}
