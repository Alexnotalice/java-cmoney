import java.util.Scanner;

//計算平均值 OT0009> Main
public class Ot0009{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=0;
    int sum=0;
    int k=0;
    while(n!=-1){  
    n = sc.nextInt();
    if (n==-1){
        break;
    }
    else{
        sum = sum+n;
        k++;
    }
    }   
    int trans = (sum/k);
    System.out.println(trans);
    sc.close();   
        
 }
}

