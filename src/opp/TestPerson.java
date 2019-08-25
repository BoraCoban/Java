/* *****************************************************************************
 *  Name:    	  Bora ÇOBAN
 *  Student ID:   64160013
 *  Department:   Computer Engineering
 *
 *  Assignment ID: A3 Question 1 
 *
 *  Description: Working with more than one class to print. 
 *
 **************************************************************************** */

class Person {

	  private String name;
	  private String address;
	  private String phoneNumber;
	  private String email;
	  
	public Person(){
		
	}
    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address=address;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " Address: " + getAddress() + " Phone: "+getPhoneNumber() + " email: "+getEmail();
    }
}
class Student extends Person {

   private String status;
   private String department;
  
    public Student(){
    	
    }
    public Student(String name, String address, String phoneNumber, String email, String status, String department) {
       this.status=status;
       this.department=department;
       
    }

   public String getStatus(){
	   return status;
   }
   public void setStatus(String status){
	   this.status=status;
   }
   public String getDepartment(){
	   return department;
   }
   public void setDepartment(String department){
	   this.department=department;
   }
   
    @Override
    public String toString() {
    	return "Name: " + getName() + " Address: " + getAddress() + " Phone: "+getPhoneNumber() + " email: "+getEmail() +
    	        " Status: "+getStatus() + " Department: "+getDepartment();
    }
}
class Employee extends Person {

    private double salary;
    private String office;
    private String dateHired;

    public Employee(){
    	
    }
    public Employee(String name, String address, String phoneNumber, String email,
    		        String office,double salary, String dateHired) {
    	this.office=office;
        this.salary=salary;
        this.dateHired=dateHired;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getDateHired() {
        return dateHired;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
    	return "Name: " + getName() + " Address: " + getAddress() + " Phone: "+getPhoneNumber() + " email: "+getEmail() +
    	        " Office: "+getOffice() + " Salary: "+getSalary() + " Hiring date: "+getDateHired();
    }
	
}
class Faculty extends Employee {


    protected String officeHours;
    protected String rank;

    public Faculty() {
        
    }

    public Faculty(String name, String address, String phoneNumber, String email, String office, double salary,
    			   String dateHired, String officeHours, String rank) {
        this.officeHours=officeHours;
        this.rank=rank;
    }

    

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
    	return "Name: " + getName() + " Address: " + getAddress() + " Phone: "+getPhoneNumber() + " email: "+getEmail() +
    	        " Office: "+getOffice() + " Salary: "+getSalary() + " Hiring date: "+getDateHired() 
    	        + " Office Hours: "+getOfficeHours() + " Rank: "+getRank();
    }
}
class Staff extends Employee {

    private String title;

    public Staff() {
        

    }

    public Staff(String name, String address, String phoneNumber, String email, String office, double salary
			, String dateHired, String title) {
        
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
    	return "Name: " + getName() + " Address: " + getAddress() + " Phone: "+getPhoneNumber() + " email: "+getEmail() +
    	        " Office: "+getOffice() + " Salary: "+getSalary() + " Hiring date: "+getDateHired() + " Title: "+getTitle();
    }
}
public class TestPerson {

	public static void main(String[] args) {
		// Test Person class
		Person aPerson = new Person();
		aPerson.setName("John Nueller");
		aPerson.setAddress("12 Bell street");
		aPerson.setPhoneNumber("3473339999");
		aPerson.setEmail("john12@aol.com");
		System.out.println(aPerson);
		// Test Student class
		Student aStudent = new Student ();
		aStudent.setName ( "Ferris Bueller" );
		aStudent.setAddress ( "123 Main St." );
		aStudent.setPhoneNumber ( "512-174-1212" );
		aStudent.setEmail ( "buellerf@mail.utexas.edu" );
		aStudent.setStatus ( "freshman" );
		aStudent.setDepartment("Computer Engineering");
		System.out.println ( aStudent );
		//Test Employee class
		Employee aEmp = new Employee ();
		aEmp.setName ( "Obi Mikel" );
		aEmp.setAddress ( "178 Lain St." );
		aEmp.setPhoneNumber ( "517-417-1732" );
		aEmp.setEmail ( "obiMikel@mail.utexas.edu" );
		aEmp.setOffice("MAI 6.45");
		aEmp.setSalary(80000000.0);
		aEmp.setDateHired("1 Sep 1994");
		System.out.println(aEmp);
		//Test Faculty class
		Faculty aFaculty=new Faculty();
		aFaculty.setName("Steven Gerrad");
		aFaculty.setAddress("145 Livepool St.");
		aFaculty.setPhoneNumber("654-875-9564");
		aFaculty.setEmail("stevenGerrad@mail.com");
		aFaculty.setOffice("MAI 6.71");
		aFaculty.setSalary(1000000.0);
		aFaculty.setDateHired("8 Feb 2004");
		aFaculty.setOfficeHours("Thurday(15.00-16.00)");
		aFaculty.setRank("Professor");
		System.out.println(aFaculty);
		// Test Staff class
		Staff aStaff = new Staff ();
		aStaff.setName("Jane Doe");
		aStaff.setAddress("789 First Ave");
		aStaff.setPhoneNumber("512-442-1411");
		aStaff.setEmail("doej@mail.utexas.edu");
		aStaff.setOffice("MAI 3.56");
		aStaff.setSalary(60000.00);
		aStaff.setDateHired("01 Sep 1991");
		aStaff.setTitle("Senior Manager");
		System.out.println(aStaff);
		
	}

}
