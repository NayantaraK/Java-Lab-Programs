import java.util.*;
class fatherage extends Exception{
	public String toString(){
		return("Father's age is lesser than 0");
	}
}
class sonage extends Exception{
	int a;
	sonage(int age){
		a=age;
	}

	public String toString(){
		if(a<0)	
			return("Son's age is lesser than 0");
		else
			return("Invalid, son's age is greater than father's");
	}
}

class father{
	int age1;
	Scanner sc=new Scanner(System.in);
	father(){
		System.out.print("Enter father's age:");
		age1=sc.nextInt();
	}
	void ex1() throws fatherage{
		if(age1<0)
		throw new fatherage();
	}
}

class son extends father{
	int age2;
	Scanner sc= new Scanner(System.in);
	son(){
		System.out.print("Enter son's age:");
		age2=sc.nextInt();
	}

	void ex2() throws sonage{
		if(age2<0|| age2>age1){
			throw new sonage(age2);
		}
}
}

class except{
	public static void main(String args[]){
		son s=new son();
		try{
			s.ex1();
		}
		catch(fatherage e){
			System.out.println(e);
		}
		try{
			s.ex2();
		}
		catch(sonage e){
			System.out.println(e);
		}
	}
}

	
		