import java.util.Scanner;
//import java.util.Arrays;
//連續求最大值 Ot0007>Main
public class Ot0007{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    for (int i=0;i<N;i++){
        int K = sc.nextInt();
        int arr[] = new int[K];                     
        for (int j=0;j<arr.length;j++){                         
            arr[j]=sc.nextInt();
            }        
        int max =arr[0]; 
        for (int j=0;j<arr.length;j++){            
            if (max<arr[j]){
            max = arr[j];
            }
        }
        //System.out.println(Arrays.toString(arr));
        System.out.println(max);
    }
    sc.close();
  }
}