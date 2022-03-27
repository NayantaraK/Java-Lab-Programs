package SEE;
import CIE.*;
import java.util.*;

public class Externals extends CIE.Student{
		Scanner sc=new Scanner(System.in);
		public int seem[]=new int[5];
		
		public void accept(){
			int i;
			for(i=0;i<5;i++){
				System.out.print("Enter SEE marks in subject "+(i+1)+":");
				seem[i]=sc.nextInt();
			}
		}
}