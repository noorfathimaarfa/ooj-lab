class AddgreG<I,D>
{
I a,b,c,iadd;
D d,e,f,dadd;
AddgreG(I i1,I i2,I i3,D d1,D d2,D d3)
{
a=i1;
b=i2;
c=i3;
d=d1;
e=d2;
f=d3;

}

/*void acceptvalue()
{
Scanner S=new Scanner(System.in);
System.out.println("Enter 3 values of integers ");
a=S.nextInt();
b=S.nextInt();
c=S.nextInt();
System.out.println("Enter 3 values of Double");
d=S.nextDouble();
e=S.nextDouble();
f=S.nextDouble();
}
*/
I geta()
{

return (a);
}
I getb()
{

return (b);
}
I getc()
{

return (c);
}
D getd()
{

return (d);
}
D gete()
{

return (e);
}
D getf()
{

return (f);
}


}
public class Extraprogram102{
public static void main(String args[])
{

AddgreG<Integer,Double> A1=new  AddgreG<Integer,Double>(10,78,65,90.87,45.67,65.87);
Integer In=A1.geta()+A1.getb()+A1.getc();
Double Do=A1.getd()+A1.gete()+A1.getf();
System.out.println("The addition of three integers is "+In);
System.out.println("The addition of three double values is"+Do);


{
if((A1.geta()>A1.getb())&&(A1.geta()>A1.getc()))
{
System.out.println("The integer "+A1.geta()+"is greater than "+A1.getb()+"and"+A1.getc());
}
else if((A1.getb()>A1.geta())&&(A1.getb()>A1.getc()))
{
System.out.println("The integer "+A1.getb()+"is greater than "+A1.geta()+"and"+A1.getc());
}
else if((A1.getc()>A1.geta())&&(A1.getc()>A1.getb()))
{
System.out.println("The integer "+A1.getc()+"is greater than "+A1.geta()+"and"+A1.getb());
}
}
{
if((A1.getd()>A1.gete())&&(A1.getd()>A1.getf()))
{
System.out.println("The integer "+A1.getd()+"is greater than "+A1.gete()+"and"+A1.getf());
}
else if((A1.gete()>A1.getd())&&(A1.gete()>A1.getf()))
{
System.out.println("The integer "+A1.gete()+"is greater than "+A1.getd()+"and"+A1.getf());
}
else if((A1.getf()>A1.getd())&&(A1.getf()>A1.gete()))
{
System.out.println("The integer "+A1.getf()+"is greater than "+A1.getd()+"and"+A1.gete());
}
}


}
}












