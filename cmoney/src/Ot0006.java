import java.util.Scanner;
//計算任意數字總和 Ot0006>Main
public class Ot0006{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int quanties = sc.nextInt();
    int sum=0;
    for (int i =0;i<quanties;i++){        
        int x = sc.nextInt();
        sum=sum+x;
    }    
    System.out.println(sum);
    sc.close();
  }
}
