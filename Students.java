package week3.day1;

public class Students {

public void getStudentInfo()
{
	System.out.println("Studen Information method in Method Overloading without arguments");
}

public void getStudentInfo(int id)
{
	
	System.out.println("Student ID: "+id);
}

public void getStudentInfo(int id,String name)
{
	System.out.println("Student ID: "+id + " Student Name: " +name);
}

public void getStudentInfo(String email , long phoneNumber)
{
	System.out.println("Student email:" +email + " Student phonenumber: " +phoneNumber);
}


public static void main(String[] args) {
	
	Students studentsObj = new Students();
	studentsObj.getStudentInfo();
	studentsObj.getStudentInfo(828);
	studentsObj.getStudentInfo(777, "Test Leaf");
	studentsObj.getStudentInfo("dhakshuparthiba@gmail.com",9944994883L);
	
	
}
}



