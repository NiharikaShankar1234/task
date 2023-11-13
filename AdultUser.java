package Test2;

public class AdultUser implements LibraryUser {
	int age;
	 String bookType;
	@Override
	public void registerAccount() {
		if(age>12) {
			System.out.println("You have Successfully Registered Under an Adult Account");
		}
		else if(age<12) {
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");

		}
	}

	@Override
	public void requestBook() {
		if(bookType == "Fiction") {
			System.out.println("Book Issued Successfully, please Return the Book within 7 days");
		}
		else {
			System.out.println("OOPS, you are allowed to take only adult Fiction Books");

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
