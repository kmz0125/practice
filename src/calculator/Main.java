package calculator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Scannerオブジェクトの作成

        try {
            System.out.println("数値1を入力してください:");
            double num1 = scanner.nextDouble();

            System.out.println("数値2を入力してください:");
            double num2 = scanner.nextDouble();

            System.out.println("演算子（+､-､*､/,%,^）を入力してください:");
            char operator = scanner.next().charAt(0);

            //計算結果の一時保存用
            double result;

            switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("0で割ることはできません");
                }
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            case '^':
                result = Math.pow(num1, num2);
                break;
            default:
                throw new IllegalArgumentException("無効な演算子です。");
            }

            //計算結果を表示
            System.out.println("結果:" + result);
        } catch (InputMismatchException e) {
            System.out.println("無効な入力です。数値を入力してください");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}