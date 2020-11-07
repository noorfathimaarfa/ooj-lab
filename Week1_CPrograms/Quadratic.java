import java.util.Scanner;
import static java.lang.Math.sqrt;
class Quadratic{
public static void main(String[] args){
double a,b,c,D,r1,r2,real,imagnery;
Scanner R = new Scanner(System.in);
System.out.println("Enter the coefficient");
a = R.nextDouble();
b = R.nextDouble();
c = R.nextDouble();
D = (b*b)-(4*a*c);
if(D==0)
{
 r1=r2=-b/(2*a);
 System.out.println(" Roots are equqal");
System.out.println("Roots are  = " +r1+ "and " +r2);
}else if(D>0)
{ System.out.println(" roots are different");
  r1= (-b+sqrt(D))/(2*a);
  r2 =( -b-sqrt(D))/(2*a);
 System.out.println("Roots are = " +r1+ " and " +r2);
}else 
{
  System.out.println(" There are no real solutions");
  real = -b/(2*a);
  imagnery = sqrt(-D)/(2*a);
  System.out.println("real and imaginary Roots are = " +real+ " and " +imagnery);
}
}
}
  
