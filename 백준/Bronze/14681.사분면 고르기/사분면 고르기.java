import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        int x = a > 0? 1 : 0;
        int y = b > 0? 1 : 0;
        
        if (x == 1) { // x가 양수
            if (y == 1) { // y가 양수 
                System.out.println("1");
            } else {      // y가 음수 
                System.out.println("4");
            }
        } else { // x가 음수 
            if (y == 1) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }
        }
    }
}
