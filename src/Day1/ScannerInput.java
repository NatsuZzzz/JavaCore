package Day1;
import java.util.Scanner;
public class ScannerInput {
    public static void main(String[] args) {
        // Scanner là gì? -> Nhận dữ liệu từ người dùng.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        sc.close();
    }
}
