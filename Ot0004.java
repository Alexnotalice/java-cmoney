import java.util.Scanner;
//BMI計算 Ot0004 > Main
public class Ot0004{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float height = sc.nextFloat();
    float weight = sc.nextFloat();  
    float BMI = weight/((height/100)*(height/100)); 
    String str = String.format("%.1f",BMI);
    if(BMI < 18.5){
      System.out.println(str +" 過輕");
    }  
    else if(BMI >= 18.5 && BMI <24){
      System.out.println(str +" 正常");
    } 
    else if(BMI >= 24 && BMI <27){
      System.out.println(str +" 過重");
    } 
    else if(BMI >= 27 && BMI <30){
      System.out.println(str +" 輕度肥胖");
    } 
    else if(BMI >= 30 && BMI <35){
      System.out.println(str +" 中度肥胖");
    } 
    else if(BMI >= 35 ){
      System.out.println(str +" 重度肥胖");    
    }
    
    sc.close();
   
  }
}

