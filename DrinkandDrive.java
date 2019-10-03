import java.util.Scanner;

public class DrinkandDrive{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please insert age");
    int age = scan.nextInt();
    if(age<16)
      System.out.println("Not old enough to drink or drive");
    else if(age>21)
      System.out.println("Old enough to drink and to drive (But not at the same time)");
    else
      System.out.println("Old enough to drive, but not to drink");
  }
}
