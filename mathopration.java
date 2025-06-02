class MathOperation {
    int addition(int a, int b) {
        return a + b;
    }
    int addition(int a, int b, int c) {
        return a + b + c;
    }
}

public class mathopration {
    public static void main(String[] args) {
        MathOperation maths = new MathOperation();
        System.out.println(maths.addition(7, 7));
        System.out.println(maths.addition(7, 7, 7));
    }
}