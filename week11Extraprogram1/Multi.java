class NewThread implements Runnable {
String name; // name of thread
Thread t;
int sum=0;
NewThread(String threadname) {
name = threadname;
t = new Thread(this, name);
System.out.println("New thread: " + t);
t.start(); // Start the thread
}
// This is the entry point for thread.
public void run() {

for(int i = 1; i <100; i=i+2) {
sum=sum+i;
System.out.println("sum is "+sum);

}
} 


}

public class Multi{
public static void main(String args[]) {
int summ=0;
new NewThread("One"); 

for(int i = 2; i <100; i=i+2) {
summ=summ+i;
System.out.println("sum  of even numbers from 1 to 100 is "+summ);
}

 
}
}
