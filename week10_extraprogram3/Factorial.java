import java.util.Scanner;
class check
{
static int  num;
int fact=1;
void acceptname()
{
Scanner S=new Scanner(System.in);
System.out.println("Enter the number\n");
num=S.nextInt();
}
int calculate()
{
if(num>15)
return 0;
for(int i=num;i>0;i--)
{
fact=fact*i;

}
return fact;


}
static void computefactorial() throws ArithmeticException
{
try{
if(num>15)
throw new ArithmeticException("ENTER THE NUMBER LESS THAN 15");
System.out.println("you have entered "+num);
}
catch(ArithmeticException e)
{
System.out.println("caught"+e);


}




}
}
public class Factorial{
public static void main(String args[]){
check c=new check();
c.acceptname();
check.computefactorial();
System.out.println("Factorial of given number is"+c.calculate());
}
}
