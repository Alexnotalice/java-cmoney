import java.util.Scanner;
//判斷等比數列 St103 >Main
public class St103{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();    
    String numOri[]= new String[N];
    int numInt[] = new int[N];    
    sc.nextLine();
    numOri=sc.nextLine().split(" ");
     
    for(int i=0;i<N;i++){
      numInt[i]=Integer.parseInt(numOri[i]);
    }   
    
    if(N==1){
      System.out.println("false");
    }
    else if(N==2){
      switch (numInt[1]%numInt[0]){
        case 0:
          System.out.println("true");
          break;
        case 1:
          System.out.println("false");
          break;
      }
    }
    else{
      int a=numInt[0];
      int b=numInt[1];
      int x=0;
      for(int s=2;s<N;s++){
        if(numInt[s]==b*b/a){
          a=b;
          b=numInt[s];
          x++;
        }
        else{
          break;
        }  
      }
      if (x==N-2){
        System.out.println("true");
      }
      else {
        System.out.println("false");
      }

    }
    sc.close();

    
  }
}
