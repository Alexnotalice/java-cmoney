import java.util.Scanner;
import java.util.Arrays;
//三個數字取最小值 Ot0005>Main
public class Ot0005{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int arr[] = new int[3];                      
    for (int j=0;j<3;j++){                         
        arr[j]=sc.nextInt();
        }        
    int min =arr[0]; 
    for (int j=0;j<3;j++){            
        if (min >arr[j]){
        min = arr[j];
        }
    }
    System.out.println(Arrays.toString(arr));
    System.out.println(min);
    
    sc.close();
  }
}