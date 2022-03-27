package CIE;
import java.util.*;

public class Internals extends Student{
		Scanner sc=new Scanner(System.in);
		public int ciem[]=new int[5];
		
		public void accept(){
			int i;
			for(i=0;i<5;i++){
				System.out.print("Enter CIE marks in subject "+(i+1)+":");
				ciem[i]=sc.nextInt();
			}
		}
}