package superDemo;

public class Person {
	String city = "Bengaluru";
    int uid = 56060;

    Person(){
        System.out.println(uid);
    }

    public void display(){
        System.out.println(city + " " + uid);
    }
}
