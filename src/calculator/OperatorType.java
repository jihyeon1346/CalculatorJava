package calculator;

public enum OperatorType {
    ADD('+') {
        @Override
        public int calculate(int num1, int num2) {
            return num1 + num2;
        }
    },
    SUBTRACT('-') {
        @Override
        public int calculate(int num1, int num2) {
            return num1 - num2;
        }
    },
    MULTIPLY('*') {
        @Override
        public int calculate(int num1, int num2) {
            return num1 * num2;
        }
    },
    DIVIDE('/') {
        @Override
        public int calculate(int num1, int num2) {
            if (num2 == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
                return 0;
            }
            return num1 / num2;
        }
    },
    MODULO('%') {
        @Override
        public int calculate(int num1, int num2) {
            if (num2 == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
                return 0;
            }
            return num1 % num2;
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


    public abstract int calculate(int num1, int num2);

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
