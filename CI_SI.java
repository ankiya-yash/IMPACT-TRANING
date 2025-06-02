public class CI_SI {
    public static void main(String[] args) {
        SimpleInterest si = new SimpleInterest(1000, 5, 2); // principal, rate, time
        CompoundInterest ci = new CompoundInterest(1000, 5, 2);

        System.out.println("Simple Interest: " + si.interest);
        System.out.println("Compound Interest: " + ci.interest);
    }
}

class SimpleInterest {
    double interest;

    SimpleInterest(double principal, double rate, double time) {
        interest = (principal * rate * time) / 100;
    }
}

class CompoundInterest {
    double interest;

    CompoundInterest(double principal, double rate, double time) {
        interest = principal * Math.pow((1 + rate / 100), time) - principal;
    }
}