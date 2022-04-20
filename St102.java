import java.util.Scanner;
//分數判斷 St102>Main
public class St102{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int quanties = sc.nextInt();
    if (quanties>0 & quanties<=10){
        int score= quanties*6;
        System.out.println(score);
    }
    else if (quanties>10 & quanties<=20){
        int score= (quanties-10)*2+60;
        System.out.println(score);
    }
    else if (quanties>20 & quanties<=40){
        int score= (quanties-20)*1+80 ;
        System.out.println(score);
    }
    else if (quanties>40 & quanties<=50){        
        System.out.println("100");
    }
    sc.close();


  }
}
