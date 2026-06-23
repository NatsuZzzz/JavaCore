package Day1;
import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Math.pow() => lũy thừa ví dụ: 2 ^ 3
        double result;
        result = Math.pow(2, 3);
        System.out.println(result);

        // Math.PI
        System.out.println(Math.PI);

        // Math.abs() giá trị tuyệt đối ví dụ (-5) in ra 5
        result = Math.abs(-5);
        System.out.println(result);

        // Math.sqrt() là căn bậc 2
        result = Math.sqrt(36);
        System.out.println(result);

        // Math.round() là làm tròn đến số nguyên gần nhất
        result = Math.round(2.14);
        System.out.println(result);

        // Math.ceil() làm tròn đến trần của số
        result = Math.ceil(9.11);
        System.out.println(result);

        // Math.floor() làm tròn xuống sàn của số
        result = Math.floor(9.99);
        System.out.println(result);

        // Math.max(a, b) lấy giá trị lơn nhất
        result = Math.max(10, 20);
        System.out.println(result);

        // Math.min() lấy giá trị nhỏ nhất
        result = Math.min(10, 20);
        System.out.println(result);



        sc.close();
    }
}
