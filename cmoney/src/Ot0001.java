import java.util.Scanner;
//A+B Ot0001>Main
public class Ot0001 {
  public static void main(String[] args) {
    
    int a, b,sum;
    Scanner sc = new Scanner(System.in);
    
    a = sc.nextInt();   
    b = sc.nextInt();
   
    
    sum = a + b ;
    System.out.println(sum);
    sc.close();
  }
}