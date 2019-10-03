import java.util.Scanner;

public class Drink{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please insert age");
    int age = scan.nextInt();
    if(age >= 21)
      System.out.println("Old enough to drink.");
    else
      System.out.println("Not old enough to drink");
  }
}
