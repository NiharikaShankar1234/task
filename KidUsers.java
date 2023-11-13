package Test2;

public class KidUsers implements LibraryUser 
{
 int age;
 String bookType;
	@Override
	public void registerAccount() {
		if(age<12) {
			System.out.println("You have Successfully Registered under a kids Account");
		}
		else if(age>12) {
			System.out.println("Sorry, Age must be less than 12 to Register as a Kid");
		}
		
	}

	@Override
	public void requestBook() {
		if (bookType == "Kids") {
			System.out.println("Book Issued Successfully, please Return the Book within 10 days");
	}
		else {
			System.out.println("OOPS, you are allowed to take only kids books");

		}
	
}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getbookType() {
		return bookType;
	}
	public void setbookType(String bookType) {
		this.bookType = bookType;
	}

}