import java.util.Scanner;
// 數列問題 Ft7016>Main
public class Ft7106{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String [] numberArray= new String[N];
    int []number= new int[N];
    if(N>=3 && N<=50){        
    sc.nextLine();
    String numberStr = sc.nextLine();
    numberArray = numberStr.split(" ");        
    }
    for(int i=0;i<N;i++){
        number[i] =Integer.parseInt(numberArray[i]);
        //System.out.println(number[i]);
        
    }
    int a=number[0];
    int b=number[1];    
    int acc=0;
    for(int k=2;k<N;k++){
        if(a*b == number[k]){
            a=b;
            b= number[k];
            acc++;
        }
    }
    if(acc == N-2){
        System.out.println("true");                    
    }
    else{
        System.out.println("false");
    }     
    
    
    sc.close();
  }
}
