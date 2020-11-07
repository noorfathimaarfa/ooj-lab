import java.util.*;
class Book {
	String name;
	String author;
	int price;
	int num_pages;
	Book()
	{
		this.name="LOLITA";
		this.author="VOLDMER";
		this.price=458;
		this.num_pages=89;
	}
	void get()
	{
		Scanner b=new Scanner(System.in);
		System.out.println("Enter the name of the book");
		name=b.next();
		System.out.println("Enter the author of the book");
		author=b.next();
		System.out.println("Enter the price of the book");
		price=b.nextInt();
		System.out.println("Enter the number of pages of the book");
		num_pages=b.nextInt();
	}
	public String toString()
	{
		return "Book Title :" +name+ "  No of pages :" +num_pages+ "  Author :"+author+ "  Price : " +price;
	}
}
class BookMain {
	public static void main(String ss[])
	{
                Book B1=new Book();
                System.out.println("stored book details :" +B1);
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the number of books");
		int n=a.nextInt();
		Book s[]=new Book[n];
		for(int i=0;i<n;i++)
		{
			s[i]=new Book();
			System.out.println("Enter the details of book "+(i+1));
			s[i].get();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("Details of book "+(i+1));
			System.out.println(s[i]);
		}
	}
