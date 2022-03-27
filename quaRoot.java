import java.util.Scanner;

class quaRoot{
	public static void main(String args[]){
	int a,b,c,res;
	float root1,root2,disc;
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter coefficents of quadratic eqn:");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	disc=(b*b)-(4*a*c);
	if(disc<0)res=-1;
	else if(disc==0)res=0;
	else res=1;
	
	switch(res){
		case 1:System.out.println("The roots are real and unequal\n");
		root1=(-b)+(float)(Math.sqrt(disc))/(2*a);
		root2=(+b)-(float)(Math.sqrt(disc))/(2*a);
		System.out.println("root1="+root1+" and root2="+root2);
		break;

		case 0:System.out.println("\nThe roots are real and equal\n");
			root1=root2=(-1*b)/(2*a);
			System.out.println("roots are="+root1+" and "+root2);
			break;
		
		case -1:System.out.println("\nThe roots are imaginary\n");
			disc=-1*disc;
			float r1=(-1*b)/(2*a);
			root1=(float)((Math.sqrt(disc))/(2*a));
			System.out.println("Roots are:"+r1+"+i"+root1+" and "+r1+"-i"+root1);
			break;
			

	}
}
}