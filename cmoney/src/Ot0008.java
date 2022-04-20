import java.util.Scanner;
//反轉數字 Ot0008>Main
public class Ot0008{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   int num = sc.nextInt();
   String numStr = Integer.toString(num);
   char[] numChar = numStr.toCharArray();   
   for (int x=numChar.length-1;x>-1;x--){
        System.out.print(numChar[x]);
   }
   sc.close();




  }
}
