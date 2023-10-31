package OOPS_Concept;

public class StudentOL {
	    String name;
	    int age;
	   
	    //method to print info
	    public void printInfo(){
	        System.out.println("method without parameter");
	        System.out.println(this.name);
	        System.out.println(this.age);
	    }

	    //method print info only name
	    public void printInfo(String name){
	        
	        System.out.println("Method with name parameter="+name);
	    }

	    //method with age
	    public void printInfo(int age){
	        System.out.println("Method with age parameter="+age);
	    }

	    //method with both para
	    public void printInfo(String name,int age){
	        System.out.println("method with both parameters name="+name);
	        System.out.println("method with both parameters age="+age);
	    }
}

	
