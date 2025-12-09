package calculator;

import java.util.List;
import java.util.ArrayList;

public class Step2
{
    private int result = 0;
    private List<Integer> arrayList = new ArrayList<Integer>();

    public int calculate(char operator, int num1 , int num2)
    {
        switch (operator)   //연산부분 기능 구현
        {
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
                if (num2 == 0)
                {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return 0;
                }
                result = num1 / num2;
                break;
        }
        arrayList.add(result);
        return result;
    }
    public List<Integer> getArrayList() {
        return arrayList;
    }



}
