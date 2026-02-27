package ex_Lab005_Operators;

public class Lab025_Ternary_Optr03 {
    public static void main(String[] args) {
        int num = 5;

        String status = (num > 0) ? "Positive" : (num < 0) ? "Negetive": "Zero";

        System.out.println(status);
    }
}
