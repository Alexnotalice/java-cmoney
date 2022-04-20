import java.util.Scanner;
import java.lang.Math;
//答題數判斷 St101>Main
public class St101{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    double filter= Math.ceil(x*0.6);
   
    System.out.println((int)filter);
    sc.close();
  }
}