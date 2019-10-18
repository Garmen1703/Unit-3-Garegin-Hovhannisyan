import java.util.Scanner;

public class Multiples{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Please insert a positive integer");
    int num = scan.nextInt();
    System.out.println("Please enter an upper limit");
    int limit = scan.nextInt();
    int ans = num;
    if (num <= 0){
      System.out.println("Must be a positive integer");
    }
    else if (num > limit){
      System.out.println("Limit must be larger than integer");
    }
    else{
      for(int i = 1; ans < limit; i++ ){
        ans = num*i;
        System.out.println(ans);
      }
    }
  }
}
