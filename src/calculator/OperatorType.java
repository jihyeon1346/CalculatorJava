package calculator;

public enum OperatorType  {
    ADD('+') {
        @Override
        public <T extends Number> double calculate(T num1, T num2) {
            return num1.doubleValue() + num2.doubleValue();
        }
    },
    SUBTRACT('-') {
        @Override
        public <T extends Number> double calculate(T num1, T num2) {
            return num1.doubleValue() - num2.doubleValue();
        }
    },
    MULTIPLY('*') {
        @Override
        public <T extends Number> double calculate(T num1, T num2) {
            return num1.doubleValue() * num2.doubleValue();
        }
    },
    DIVIDE('/') {
        @Override
        public <T extends Number> double calculate(T num1, T num2) {
            if (num2.doubleValue() == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
                return 0;
            }
            return num1.doubleValue() / num2.doubleValue();
        }
    },
    MODULO('%') {
        @Override
        public <T extends Number> double calculate(T num1, T num2) {
            if (num2.doubleValue() == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
                return 0;
            }
            return num1.doubleValue() % num2.doubleValue();
        }

    };


    private final char OP;

    OperatorType(char OP) //캡슐화
    {
        this.OP = OP;
    }
    public char getOP()
    {
        return OP;
    }


    //public abstract int calculate(int num1, int num2); 수정
    public abstract <T extends Number> double calculate(T num1, T num2);
    // 문자로 enum 찾기
    public static OperatorType fromOP(char op) {
        for (OperatorType operator : values()) {
            if (operator.OP == op) {
                return operator;
            }
        }
        return null;  // 지원하지 않는 연산자


    }
}
