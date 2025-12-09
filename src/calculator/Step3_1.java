package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Step3_1 {
    public static void main(String[] args)
    {
        int num1 = 0;           //숫자 입력값
        int num2 = 0;           //숫자 입력값
        char operator;          //연산자 입력값
        String exit;            //계산종료입력값

        Scanner scanner = new Scanner(System.in);   //인스턴스 생성
        Step3_2 calculator = new Step3_2();             //인스턴스 생성

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
            OperatorType operator1;

            while (true) {
                System.out.print("연산자를 입력하세요 (+, -, *, /) : ");
                char inputOp = scanner.next().charAt(0);
                scanner.nextLine();

                operator1 = OperatorType.fromOP(inputOp);

                if (operator1 != null) {
                    break;
                } else {
                    System.out.println("지원하지 않는 연산자입니다. 다시 입력하세요.");
                }
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


            int result = calculator.calculate(operator1, num1, num2);
            System.out.println(num1 + " " + operator1.getOP() + " " + num2 + " = " + result);    //result값에 연산결과 넣기

            System.out.println("계산을 종료 하시려면 exit를 계산결과를 확인하려면 list를 입력해주세요");
            exit = scanner.nextLine();

            int choice = 0;

            if (exit.equals("exit"))
            {
                System.out.println("계산을 종료합니다.");
                System.exit(0);
            }
            else if (exit.equals("list"))   // 이력 출력
            {
                if (calculator.getArrayList().size() == 0)  //리스트에 아무것도 없다면..
                {
                    System.out.println("이력이 없습니다.");
                }
                else    // 옵션선택
                {
                    for (int res : calculator.getArrayList())
                    {
                        System.out.println(res);
                    }
                    try
                    {
                        System.out.println("1. 돌아가기");  //다시 계산
                        System.out.println("2. 첫 이력 삭제"); //첫줄 이력 삭제
                        choice = scanner.nextInt();
                        scanner.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("숫자를 입력해주세요.");
                    }



                    switch (choice) {

                        case 1:
                            continue;
                        case 2: {
                            calculator.getArrayList().remove(0);
                            System.out.println("삭제되었습니다.");
                            scanner.nextLine();
                            continue;
                        }
                        default:
                            System.out.println("1, 2 중 하나를 입력해주세요.");

                    }//switch (choice)


                }//옵션선택
            }// 이력 출력
            else
            {
                System.out.println("계산을 이어서 진행합니다.");
            }
        }//while (true)//계산 반복을 위해 추가
    }//public static void main(String[] args)
}
