import java.util.Scanner;
//簡易四則運算  Ot0002 > Main
public class Ot0002 {
  public static void main(String[] args) {    
    Scanner sc = new Scanner(System.in);
    int a, b, c,sum;
    
    a = sc.nextInt(); 
    b = sc.nextInt();
    c = sc.nextInt();
    
    sum = 2 * a + 6 / b + c;
    System.out.print(sum);
    sc.close();
    
  }
}