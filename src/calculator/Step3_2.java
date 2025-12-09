package calculator;

import java.util.ArrayList;
import java.util.List;

public class Step3_2 {
    private int result = 0;
    private List<Integer> arrayList = new ArrayList<Integer>();

    public int calculate(OperatorType operator, int num1, int num2) {
        int result = operator.calculate(num1, num2);
        arrayList.add(result);
        return result;
    }
    public List<Integer> getArrayList() {

        return arrayList;
    }



}
