import java.util.Scanner;

class account
{
static Double Existbalance;
static Double withdrawnB;
static Double withexist;
account(double money)
{
Existbalance=money;
}
 void displayB()
{
System.out.println("The account balance  is"+Existbalance);
}
static void withdraw() throws NullPointerException
{
try
{
if(withdrawnB>Existbalance)
throw new NullPointerException("Your account does not have that much money \n plz enter limited amount");
withexist=Existbalance-withdrawnB;
System.out.println("You have withdrawn RS"+withdrawnB+"The remaining balance is "+withexist);
}


catch( NullPointerException e)
{
System.out.println("error:"+e);
}

}
}
public class withbalance{
public static void main(String args[]){
account A=new account(10000);
Scanner S=new Scanner(System.in);
int choice;
System.out.println("Enter your choice :\n1:display Balance\n2:withdrawn money\n3:exit\n");
choice =S.nextInt();
switch(choice)
{
case 1:
A.displayB();
break;
case 2:
System.out.println("Enter money to withdraw");
account.withdrawnB=S.nextDouble();
account.withdraw();
break;
case 3:
System.exit(0);
break;
}
}
}
