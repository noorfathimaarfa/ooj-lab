/*Develop a Java program to find the transpose of a given matrix of order MXN.*/
import java.util.Scanner;  
public class MatrixTranspose 
{  
    public static void main(String args[])    
    {  
    int i, j;  
    System.out.println("Enter total rows and columns: ");  
    Scanner s = new Scanner(System.in);  
    int M = s.nextInt();  
    int N= s.nextInt();  
    int array[][] = new int[M][N];  
    System.out.println("Enter matrix:");  
    for(i = 0; i < M; i++)  
    {  
        for(j = 0; j < N; j++)   
            {  
            array[i][j] = s.nextInt();  
            System.out.print(" ");  
            }  
    }  
    System.out.println("The above matrix before Transpose is ");  
    for(i = 0; i < M; i++)  
        {  
            for(j = 0; j < N; j++)  
            {  
            System.out.print(array[i][j]+" ");  
            }  
            System.out.println(" ");  
        }  
    System.out.println("The above matrix after Transpose is ");  
    for(i = 0; i < M; i++)  
        {  
            for(j = 0; j < N; j++)  
            {  
                System.out.print(array[j][i]+" ");  
            }  
            System.out.println(" ");  
        }  
    }  
} 
/*Develop a Java program which has the (only) class CircleDemo that has members radius, area and perimeter. Include methods to do the following.
a. accept the radius from the user
b. find the area of the circle
c. find the perimeter of the circle
d. Display all the details*/
import java.util.Scanner;
class CircleDemo
{

  private double radius;
  private double area;
  private double perimeter;

void Accept()
{
Scanner C=new Scanner(System.in);
System.out.println("Enter the radius of a circle");
radius=C.nextDouble();
}
void calculate()
{
area=3.14*radius*radius;
perimeter=3.14*(2*radius);
}
void display()
{
System.out.println( "the area of a circle with radius "+radius+" is " +area);
System.out.println( "the perimeter of a circle with radius"+radius+"is "+perimeter);

}
}
class CircleMain{
public static void main(String args[])
{
Scanner R=new Scanner(System.in);
System.out.println("enter the number of circles");
int n=R.nextInt();
CircleDemo[] ci=new  CircleDemo[n];
for(int i=0;i<n;i++)
{
ci[i]=new CircleDemo();
ci[i].Accept();
ci[i].calculate();
ci[i].display();
}
/*Develop a Java program to create a class Actor with id, name, no_of_movies,no_of_years_exp. Calculate the average_performance for each of the actor and print
the name of the actor with highest average.*/
import java.util.Scanner;
class Actor
{
private String id;
String name;
private int no_of_movies;
private int no_of_years_exp;
int average_performance;


void accept()
{
Scanner A=new Scanner(System.in);
System.out.println("id: ");
id =A.next();
System.out.println("name : ");
name =A.next();
System.out.println("number of movies : ");
no_of_movies =A.nextInt();
System.out.println("number of years: ");
no_of_years_exp=A.nextInt();
}
int calculate()
{
average_performance =no_of_movies/no_of_years_exp;
return average_performance;

}
}
class ActorMain
{
public static void main(String args[])
{
int more=0;
String highest_name;
Scanner R=new Scanner(System.in);
System.out.println("enter the number of actor");
int n=R.nextInt();
Actor[] ci=new  Actor[n];
for(int i=0;i<n;i++)
{
ci[i]=new Actor();
ci[i].accept();

if(ci[i].calculate()>more)

more = ci[i].calculate();
highest_name=ci[i].name;



}

System.out.println("the actor who has  the highest avearge performance is"+highest_name);

}
}
