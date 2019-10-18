import java.util.Scanner;

public class StringLine{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please insert a string.");
    String string = scan.next();
    int length = string.length();
    for ( int count = 0; count<length ; count ++ ){
      System.out.println(string.charAt(count));
    }
  }
}
