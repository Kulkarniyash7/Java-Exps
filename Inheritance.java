import java.util.Scanner;

class Person{
String name;
String birthdate;
int hieght , wieght , age;
String address ;

	void get_info(){
	Scanner sc=new Scanner(System.in); 
	System.out.println("Enter Your Name");
	String name = sc.nextLine();
	System.out.println("Enter Your Birthdate");
	String birthdate = sc.nextLine();
	System.out.println("Enter Your Hieght and Weight respectively");
	int hieght= sc.nextInt();
	int wieght= sc.nextInt();
	
	}


}
class Student extends Person{
int rollno;
int i;
int a[];
int avg;
int sum;
	void get_info(){
	super.get_info();
	Scanner sc=new Scanner(System.in); 
	System.out.println("Enter your Roll No.");
	rollno = sc.nextInt();
	System.out.println("Enter Number of Subjects");
	int n = sc.nextInt();
	a= new int[n];
	System.out.println("Enter your marks for 5 subjects");
	for(i=0;i<a.length;i++){
	a[i]=sc.nextInt();
	}
	for(i=0;i<n;i++){
	sum=sum+a[i];
	}
	avg = sum/(n);
	System.out.println("Your Avg marks are - "+avg);

	}

}

class Main{
	
	public static void main(String[]args){

	Student s1= new Student();
	s1.get_info();
	
	
	}
}