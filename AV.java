import java.util.Scanner;

abstract class Solid{
double radius;
double height;
void SA()
{}
void V()
{}

}
class Cylinder extends Solid{
void SA()
{
double Csurface_Area=(2*3.14*radius*height)+(2*3.14*radius*radius);
System.out.println("The surface area of Cylinder is"+Csurface_Area);

}

void V()
{

double Cvolume=(3.14*radius*radius)+(height);
System.out.println("The volume of Cylinder is"+Cvolume);
}
}
class Cone extends Solid{
void SA()
{
double COsurface_Area=((3.14*radius)*(radius+Math.sqrt((height*height)+(radius*radius))));
System.out.println("The surface area of cone is"+COsurface_Area);

}

void V()
{

double COvolume=((1/3)*(3.14)*(radius*radius)*(height));
System.out.println("The volume of Cone is"+COvolume);
}
}
class Sphere extends Solid{
void SA()
{
double Ssurface_Area=(4*3.14*radius*radius);
System.out.println("The surface area of Cylinder is"+Ssurface_Area);

}

void V()
{

double Svolume=((4/3)*3.14*radius*radius*radius);
System.out.println("The volume of Cylinder is"+Svolume);
}
}
class AV
{
public static void main(String args[])
{
Cylinder C=new Cylinder();
Sphere  S=new Sphere();
Cone CO=new Cone();
Scanner s=new Scanner(System.in);
System.out.println("Enter the radius and height of the solid Cylinder ");
C.radius=s.nextInt();
C.height=s.nextInt();


System.out.println("Enter the radius and height of the solid cone");
CO.radius=s.nextInt();
CO.height=s.nextInt();


System.out.println("Enter the radius and height of the solid  Sphere");
S.radius=s.nextInt();
S.height=s.nextInt();
C.SA();
C.V();
CO.SA();
CO.V();
S.SA();
S.V();






}

}
