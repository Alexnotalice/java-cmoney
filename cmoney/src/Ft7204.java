// import java.util.Scanner;


// public class Ft7204{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int T = sc.nextInt();
//     String [] numberArray= new String[N];
//     int []numbers = new int[N];       
     
//     for(int i=0;i<T;i++){
//       int N = sc.nextInt();
      
//       sc.nextLine();
//       String numberStr = sc.nextLine();
//       numberArray = numberStr.split(" ");     
      
//       for(int x=0;x<N;x++){        
//         numbers[x] =Integer.parseInt(numberArray[x]);
//         //System.out.println(numbers[x]);
//       } 
//       int temp; 
//       int count=1;      
//       if(numbers[0]%2==0){       
//           temp=0;
//       }else{
//           temp=1; 
//       }       
//       while(temp==1 || temp==0 && count<N && count>0){
//         switch(numbers[count]%2){
//           case 0:
//             temp=temp-1;
//             count++;
//             break;
//           case 1:
//             temp=temp+1;
//             count++;
//             break;
//         }                                             
//       }      
             
//       if(temp==0 || temp==1){
//         System.out.println("true");
//       }else{
//         System.out.println("false");
//       }      
//     }
//     sc.close();
//   }
// }