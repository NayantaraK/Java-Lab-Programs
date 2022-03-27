import java.util.Scanner;
class Book{
	String name,author;
	int price,num_pages;

Book(){
name="Methua";
author="Amish";
price=430;
num_pages=345;
}

void accept(){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the name of the book:");
	name=sc.nextLine();
	System.out.print("Enter the name of the author:");
	author=sc.nextLine();
	System.out.print("Enter the price:");
	price=sc.nextInt();
	System.out.print("Enter the number of pages:");
	num_pages=sc.nextInt();
}
public String toString(){
return("Name:"+name+"\nAuthor:"+author+"\nPrice:"+price+"\nPages:"+num_pages);
}
}
class bookMain{
public static void main(String args[]){
	int n,i;
System.out.print("Enter the number of books:");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
Book b[]=new Book[n];
for(i=0;i<n;i++){
b[i]=new Book();
System.out.println("Enter the details of the book "+(i+1) );
b[i].accept();
}
for(i=0;i<n;i++){
System.out.println("Details of the book "+(i+1));
System.out.println(b[i]);
}
}
}


