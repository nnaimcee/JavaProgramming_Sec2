import java.time.*;
public class FictionBook implements Author,Book{
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	
	public FictionBook(String title,int publicYear) {
		this.title = title;
		this.publicYear = publicYear;
	}
	
	public void setAuthorName(String name) {
		this.author_name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean checkFormatName() {
		if(author_name.indexOf(" ") > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public boolean checkEmail() {
		if(email.endsWith("@hotmail.com") || email.endsWith("@windowslive.com")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getLastName() {
		int space = author_name.indexOf(" ");
		String lastname = author_name.substring(space+1);
		return lastname.toUpperCase();
	}
	
	public String getFirstName() {
		int space = author_name.indexOf(" ");
		String firstname = author_name.substring(0,space);
		return firstname.toUpperCase();
	}
	
	public int totalPublicYear() {
		return Year.now().getValue() - publicYear;
	}
	
	public String toString() {
		return title + "write by " + getLastName().substring(0,1) + "." + getFirstName() + "(" + email + ")\nPublished for " + totalPublicYear() + " years.";
	}
	
}
