package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Step1 {    public static void main(String[] args) {
    int num1 = 0;           //숫자 입력값
    int num2 = 0;           //숫자 입력값
    char operator;          //연산자 입력값
    String exit;            //계산종료입력값

    Scanner scanner = new Scanner(System.in);   //인스턴스 생성
    Step2 calculator = new Step2();             //인스턴스 생성

    while (true)//계산 반복을 위해 추가
    {
        while (true)// 원하는 입력값을 받기까지 반복
        {
            try  //숫자 이외의 입력 예외처리
            {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                num1 = scanner.nextInt();
                scanner.nextLine(); // enter 키 입력방지용
                break;
            } catch (InputMismatchException e)
            {
                System.out.println("숫자를 입력해 주세요.");
                scanner.nextLine();
            }



        }

        while (true)
        {
            System.out.print("연산자를 입력하세요 (+, -, *, /) : ");
            operator = scanner.next().charAt(0);
            scanner.nextLine();

            if (operator == '+' || operator == '-' || operator == '*' || operator == '/')   //지정해놓은 연산자만 입력받기
                break;
            else
                System.out.println("지원하지 않는 연산자입니다. 다시 입력하세요.");
        }
        while (true)
        {
            try
            {
                System.out.print("두 번째 숫자를 입력하세요: ");
                num2 = scanner.nextInt();
                scanner.nextLine();
                break;
            } catch (InputMismatchException e)
            {
                System.out.println("숫자를 입력해 주세요.");
                scanner.nextLine();
            }

        }


        int result = calculator.calculate(operator, num1, num2);

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);    //결과 값
        System.out.println("계산을 종료 하시려면 exit를 입력해주세요");
        exit = scanner.nextLine();
        if (exit.equals("exit"))
        {
            System.out.println("계산을 종료합니다.");
            System.exit(0);
        } else
        {
            System.out.println("계산을 이어서 진행합니다.");
        }
    }
}
}
