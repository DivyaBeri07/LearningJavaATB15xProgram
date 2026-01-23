package ex_Lab005_Operators;

public class Lab020_Relational_operator {
    public static void main(String[] args) {
        // < Less Than
        // < =  -> Less than or equal to
        // > Greater
        // > = Greater or equal
        // == ->  Equal to (but checking)
        // != -> Not equal

        int a = 10;
        int b = 30;
        boolean c = a > b; // // 10> 30
        System.out.println(c);

        int age_Divya = 29;
        int age_Teja = 28;

        boolean result = age_Divya >= age_Teja;
        System.out.println(result);
    }
}
