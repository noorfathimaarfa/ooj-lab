/*Accept an array of size n from the user. Find the sum of even indices (i.e., 0,2,4....)and sum of odd indices (1,3,5....) and print the same*/
import java.util.*; 
  class Extraprogram1{ 
    public static void main(String args[]) 
    { 
	Scanner ss=new Scanner(System.in);
        int a[],n,even = 0, odd = 0; 
	System.out.println("Enter the number of elements");
	n=ss.nextInt();
	a=new int[n];
        System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter a["+i+"]");
			a[i]=ss.nextInt();
		}
         for (int i = 0; i < n; i++) { 
            if (i % 2 == 0) 
                even += a[i]; 
            else
                odd += a[i]; 
        } 
  
        System.out.println("Sum of even indeces of the array: " + even); 
        System.out.println("Sum of odd indices of the array: " + odd); 
    } 
}
2./*Accept an array of n integers. Find the number of positive numbers, negative numbers and zeros.*/
import java.util.Scanner;

public class No_of_nos {
    public static void main(String args[]) {
        
        int n, positive = 0, negative = 0, zero = 0, i;
        int arr[] = new int[50];
        Scanner scan = new Scanner(System.in);

        
        System.out.print("How many Number you want to Enter : ");
        n = scan.nextInt();

        
        System.out.println("Enter " + n + " Numbers : ");

        
        for (i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        for (i = 0; i < n; i++) {
            if (arr[i] < 0) {
                negative++;
            } else if (arr[i] == 0) {
                zero++;
            } else {
                positive++;
            }
        }
        
        System.out.print("Positive Numbers are: " + positive);
        System.out.print("\nNegative Numbers are: " + negative);
        System.out.print("\nZeros are: " + zero);
    }
}
/*Consider a super market bill. Accept a double array holding rate per item of say x
items and an int array showing the quantity purchased by a customer. Calculate the
total bill amount and the final bill amount after giving discounts as per the following
slabs.
If the total bill amount >=10000, discount=5%
If the total bill amount >=7500 and <10000, discount=3%
If the total bill amount >=5000, discount=2% */
import java.util.Scanner;
public class Bill {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter the number of items:");
        int n = sc.nextInt();
        double indTot, tot = 0;
        double[] rpi = new double[n];
        int[] quant = new int[n];
        for(int i = 0; i<n; i++){
            System.out.println("enter quantity of purchase and rate per item for item"+(i+1));
            int q = sc.nextInt();
            double r = sc.nextDouble();
            quant[i] = q;
            rpi[i] = r;
        }
        for(int i = 0; i<n; i++){
            indTot = quant[i] * rpi[i] ; 
            tot += indTot;
        }
        if (tot >= 10000) {
            System.out.println("Discount = 5%. Total bill = " + tot + " Discounted bill = " + (tot - tot * 0.05));
        }
        
        else if (tot >= 7500) {
            System.out.println("Discount = 3%. Total bill = " + tot + " Discounted bill = " + (tot - tot * 0.03));
        }
         else if (tot >= 5000) {
            System.out.println("Discount = 2%. Total bill = " + tot + " Discounted bill = " + (tot - tot * 0.02));
        }
        else{
            System.out.println(" No discount. Total bill = " + tot );
        }
        
    }
}
/*Accept an array A of n elements. Create two new arrays where the first one say B that
holds all the odd numbers from array A and the second say C holds the even numbers
from array A. Display the sum, average, max and min of array C.*/

import java.util.Scanner;
public class Odd_even_array {
    public static void main(String[] args){
    int n, j = 0, k = 0, sum = 0, avg, max , min;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the number of elements in array:");
    n=s.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    int[] c = new int[n];
    System.out.println("Enter the elements of the array:");
    for(int i = 0;i<n;i++){
        a[i] = s.nextInt();
    }
    for(int i = 0;i<n;i++){
        if (a[i] % 2 == 0) {
            c[j] = a[i];
            sum += a[i];
            j++;
        } else {
            b[k] = a[i];
            k++;
        }
    }
    //avg = sum / j;
    max = c[0];
    min = c[0];
    for(int i = 0; i<j;i++){
        if (c[i] > max){
            max = c[i];
        }
        if (c[i] < min){
            min = c[i];
        }
    }
    System.out.println("For the even array sum is "+sum+" average is "+(sum/j)+" maximum is "+max+" minimum is "+min);
    
}
}
