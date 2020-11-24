class GENERICSC<F,S>
{
F object1;
S object2;

GENERICSC(F O1,S O2)
{
object1=O1;
object2=O2;
}
void printname()
{
System.out.println("Type of  object 1 is "+object1.getClass().getName());
System.out.println("Type of  object 2 is "+object2.getClass().getName());
}
F getob1()
{
return object1;
}
S getob2()
{
return object2;
}
}
public class DGenerics
{
public static void main(String args[])
{
GENERICSC<Float,String> G1=new GENERICSC<Float,String>(10f,"CGPA");
G1.printname();
float FL=G1.getob1();
System.out.println("The number given  to object 1 is"+FL);
String ST=G1.getob2();
System.out.println("The detail given  to object 2 is"+ST);
}
}
