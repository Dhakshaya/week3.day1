package week3.day1;

public class Student extends Department{

	public void studentName()
	{
		System.out.print("Student Name is ");
		System.out.println("TestLeaf");
	}
	
	public void studentDept()
	{ 
		System.out.print("Student Dept is ");
		System.out.println("IT");
	}
	
	public void studentID()
	{
		System.out.print("Student ID is ");
		System.out.println("100");
		
	}
	public static void main(String[] args) {
		 Student studentObj = new Student();
		 studentObj.CollegeName();
		 studentObj.CollegeCode();
		 System.out.println("College Rank is " + studentObj.CollegeRank(001));
		 System.out.println("Departname is "+ studentObj.deptName("Computer Science"));
		 studentObj.studentName();
		 studentObj.studentDept();
		 studentObj.studentID();
		 
	}
	
	
	
	
}
