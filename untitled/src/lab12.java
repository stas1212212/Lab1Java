import java.util.Date;
import java.util.Scanner;

public class lab12 {
    public static void main(String [] args) {
        System.out.print("Put a and b: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine(); // Очистка буфера вводу
        System.out.println("S=" + (a + b));
        System.out.printf("Значення P=(%d + %d)+2 = %d%n", a, b,
                (a + b) * 2);
        Date d = new Date();
        System.out.println("Date: " + d.toString());
    }
}
