import java.util.Scanner;
//import java.util.regex.Matcher;

public class Ft9205{  
    
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String sentance= sc.next();
    boolean isIPv4 = sentance.contains(".");//Contains() is used to check out for a certain character
    //System.out.println(isIPv4);  
   
    if (isIPv4) {       
      String [] sen4Split= sentance.split("\\.");
      // //System.out.println(senSplit[2]);// input 192.168.01.1 > senSplit[2]=01
      
      Block:{for(int s=0;s<sen4Split.length;s++){        
          if(sen4Split[s].matches("[0-9]|[1-9][0-9]|[1][0-9][0-9]|[2][0-5][0-9]&&[2][5]^[6-9]")){          
            System.out.println("IPv4");
            break Block;          
          }
        }
        System.out.println("不是合法的IP");
      }   
    
      
    }else{
        String [] s6Split= sentance.split("\\:");        
        int countIPv6=0;
        for(int s=0;s<s6Split.length;s++){                      
          if(s6Split[s].matches("[A-Fa-f0-9]{1,4}")){
            countIPv6++;
          }                 
        }        
        //System.out.println(countIPv6);
        if(countIPv6==8){
          System.out.println("IPv6");
        }else{
          System.out.println("不是合法的IP");
        }

    }
    sc.close();
  }
}
