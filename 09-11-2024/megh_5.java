import java.util.Scanner;

public class megh_5 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter a number:");
        int day = s.nextInt(); 
   
        switch (day) { 
           case 1: 
              System.out.println("saturday"); 
              break; 
           case 2: 
              System.out.println("sunday"); 
              break; 
           case 3: 
              System.out.println("monday"); 
              break; 
           case 4: 
              System.out.println("Thursday"); 
              break; 
           case 5: 
              System.out.println("wednesday"); 
              break; 
           case 6: 
              System.out.println("thursday"); 
              break; 
           case 7: 
              System.out.println("friday"); 
              break; 
           default: 
              System.out.println("Invalid input!"); 
              break; 
        } 
    }
    
}
