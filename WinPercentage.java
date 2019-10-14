import java.util.Scanner;
import java.text.DecimalFormat;

public class WinPercentage{
  public static void main(String [] args){
    int ans;
    Scanner scan = new Scanner(System.in);
    DecimalFormat fmt = new DecimalFormat("0.0");
    System.out.println("Do you wish to continue? (1/0)");
    ans = scan.nextInt();
    while(ans > 0){
      System.out.println("Insert amount of games played:");
      int games = scan.nextInt();
      System.out.println("Insert amount of games won:");
      int wins = scan.nextInt();

      if(games <= 0){
        System.out.println("Amount of games played must be greater than 0.");
        ans = 0;}
      else if(wins<0){
        System.out.println("Amount of games won must be greater than or equal to zero.");
        ans = 0;}
      else if(wins>games){
        System.out.println("Amount of games won must be less than or equal to games played.");
        ans = 0;}
      else{
        double percent =(double)(wins*100)/games;
        System.out.println("Percent of games won is "+fmt.format(percent)+"%");}
      System.out.println("Do you wish to continue? (1/0)");
      ans = scan.nextInt();
    }
  }
}
