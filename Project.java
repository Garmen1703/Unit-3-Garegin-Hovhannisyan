import java.util.Scanner;
import java.util.Random;

public class Project{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    int rock = 1;
    int scis = 2;
    int paper = 3;
    int resval;
    System.out.println("Would you like to play? (1/0)");
    int ans = scan.nextInt();
    while (ans != 0){
      System.out.println("Rock, Paper or Scissors? (1,2,3)");
      int response = scan.nextInt();
      if (response < 2 ){
        resval = rock;
      }
      else if (response > 2 ){
        resval = scis;
      }
      else{
        resval = paper;
      }
      int compval = rand.nextInt(3)+1;
      if (compval == rock){
        if (resval == rock) System.out.println("Rock vs Rock: TIE.");
        else if (resval == paper) System.out.println("Paper vs Rock: WIN.");
        else if (resval == scis) System.out.println("Scissors vs Rock: LOSS");
      }
      else if (compval == paper){
        if (resval == rock) System.out.println("Rock vs Paper: LOSS.");
        else if (resval == paper) System.out.println("Paper vs Paper: TIE.");
        else if (resval == scis) System.out.println("Scissors vs Paper: WIN");
      }
      else if (compval == scis){
        if (resval == rock) System.out.println("Rock vs Scissors: WIN.");
        else if (resval == paper) System.out.println("Paper vs Scissors: LOSS.");
        else if (resval == scis) System.out.println("Scissors vs Scissors: TIE.");
      }
      System.out.println("Would you like to play again?");
      ans = scan.nextInt();
    }
  }
}
