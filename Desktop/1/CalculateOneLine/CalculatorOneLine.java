import java.util.Scanner;

public class CalculatorOneLine {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (int num = 0, value = sc.nextInt(); num <= 10; System.out
                .println(value + " x " + num + " = " + value * num++))
            ;
    }
}
