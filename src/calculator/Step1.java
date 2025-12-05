package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Step1 {    public static void main(String[] args) {
    int num1 = 0;           //숫자 입력값
    int num2 = 0;           //숫자 입력값
    char operator;          //연산자 입력값
    int result = 0;         //계산 저장값
    String exit;            //계산종료입력값

    Scanner scanner = new Scanner(System.in);

    while (true) {
        try {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            num1 = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("숫자를 입력해 주세요.");
        }
        scanner.nextLine();

        while (true) {
            System.out.print("연산자를 입력하세요 (+, -, *, /) : ");
            operator = scanner.next().charAt(0);
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/')
                break;
            else
                System.out.println("지원하지 않는 연산자입니다. 다시 입력하세요.");
        }

        try {
            System.out.print("두 번째 숫자를 입력하세요: ");
            num2 = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("숫자를 입력해 주세요.");
        }
        scanner.nextLine();

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
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                result = num1 / num2;
                break;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        System.out.println("계산을 종료 하시려면 exit를 입력해주세요");
        exit = scanner.nextLine();
        if (exit.equals("exit")) {
            System.out.println("계산을 종료합니다.");
            System.exit(0);
        } else {
            System.out.println("계산을 이어서 진행합니다.");
        }
    }
}
}
