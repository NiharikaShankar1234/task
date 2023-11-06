package superDemo;

class Student extends Person{
    String name = "Karan";
    String course = "Java";

    Student(){
        super();
        System.out.println(name + " " + course);
    }

    public void display(){
        super.display();
        System.out.println(super.uid + " " + super.city);
    } 
}