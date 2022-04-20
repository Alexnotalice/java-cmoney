import java.util.Scanner;
import java.util.Random;

public class Ft8107{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    int x = rand.nextInt(102)-1;
    int y = rand.nextInt(2)+1;   
    int i = 1;
    while(i !=-1){        
        x = rand.nextInt(102)-1;
        System.out.println(x);
        i=x;
        
        
    }        
    System.out.println(y);  
    sc.close();
    
  }
}
