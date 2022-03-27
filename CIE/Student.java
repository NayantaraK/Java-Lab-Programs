package CIE;
import java.util.*;
public class Student{
	public String USN,name;
	public int sem;
	Scanner sc=new Scanner(System.in);

	public void accept(){
		System.out.println("Enter Name, USN and Semester:");
		name=sc.nextLine();
		USN=sc.nextLine();
		sem=sc.nextInt();
	}

	public void display(){
		System.out.println("Student detials:");
		System.out.println("Name:"+name);
		System.out.println("USN:"+USN);
		System.out.println("Semester:"+sem);
	}
}
		