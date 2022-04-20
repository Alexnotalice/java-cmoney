import java.util.Scanner;
//直角三角形面積 Ot0003>Main
public class Ot0003{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Float height = sc.nextFloat();  
        Float width = sc.nextFloat(); 
       
        String hgt = String.format("%.2f",height);       
        String wdh = String.format("%.2f",width);    

        System.out.print(Float.parseFloat(hgt)*Float.parseFloat(wdh)/2);           
                    
        sc.close();
    }
}