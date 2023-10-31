
public class Student {
	    String name;
	    int age;
	    //same as class name
	    //no retrun type
	    //one object call const. only one time whe object will be created
	    //if we are not created any const. compiler will create const. for us
	    //non-paremetrized
	    Student(){
	        this.age=age;
	        System.out.println("Constructor called......");
	    }

	    //parameterized const
	    Student(String name,int age){
	        this.name=name;
	        this.age=age;
	    }

	    //method to print info
	    public void printInfo(){
	        System.out.println(this.name);
	        System.out.println(this.age);
	    }
	}
	public class stu {
	    public static void main(String[] args) {
	        //object
	        Student s1=new Student();
	        s1.name="abc";
	        s1.age=20;
	        //method call
	        s1.printInfo();

	        Student s2=new Student("pqr", 24);
	        s2.printInfo();
	        Student s3=new Student("xyz", 22);
	        s3.printInfo();
	    }
	}
}
