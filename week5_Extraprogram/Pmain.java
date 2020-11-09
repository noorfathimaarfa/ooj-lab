/*Develop a Java program to create a class Player with variables id, name, scores,no_matches_played with default access specifier. Include the following:
a. Constructors
b. appropriate methods that calculates the average scores of the player anddisplays the same.*/
import java.util.Scanner;

class Player
{
  private int id;
  private String name;
  private int scores;
  private int no_matches_played;
  private int average;

  

double average()
{
 average = scores/no_matches_played;
 return average;

}

Player(int pid,String pname,int pscores,int pno_pmatches_pplayed)
{
    System.out.println("Inside parameterized constructor ");
     id=pid;
     name=pname;
     scores = pscores;
     no_matches_played=pno_pmatches_pplayed;
}
void printdetails(){
   System.out.println("id :"+id);
   System.out.println("name :"+name);
   System.out.println("scores:"+scores);
   System.out.println("number of matches playeed :"+no_matches_played);
}
}
class Pmain
{
  public static void main(String args[])
{
  Player p1=new Player(01,"dhoni",1000,9);
    
    System.out.println(" the average of 1st player is :"+p1.average());
  Player p2=new Player(02,"sachin",2000,10);
   System.out.println(" the average of 2nd  player is :"+p2.average());
    

{
if(p1.average() > p2.average())
{
   System.out.println("player 1 has more average his detais are");
   p1.printdetails();
}
else
if(p2.average() >p1.average()) 
 System.out.println("player 1 has more average his detais are");
 p2.printdetails();
}
}
}  

  
