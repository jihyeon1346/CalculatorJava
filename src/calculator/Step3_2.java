package calculator;

import java.util.ArrayList;
import java.util.List;

public class Step3_2 <T extends Number>
{

    private List<Double> arrayList = new ArrayList<Double>();

    public double calculate(OperatorType operator, T num1, T num2) {
        double result = operator.calculate(num1, num2);
        arrayList.add(result);
        return result;
    }
    public List<Double> getArrayList() {

        return arrayList;
    }



}
