import java.util.Scanner;

public class megh_1{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value: ");
        try {
            int x=scanner.nextInt();
            if (x>0){
                System.out.println("Positive");
            } else if (x<0){
                System.out.println("Negative");
            }else{
                System.out.println("Zero");
            }
        }catch(Exception e){
            System.out.println("error Number");
        }
        scanner.close();
    }
}