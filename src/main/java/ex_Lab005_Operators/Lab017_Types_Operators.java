package ex_Lab005_Operators;

/*
operator: - An operator is a special symbol.
- Tells the compiler to perform specific mathematical or logical operations on **operands**.

three types of operator depending on the number of operands required

1. Unary Operator
2. Binary Operator
3. Ternary Operator

 */
public class Lab017_Types_Operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        //        + (Addition)
        //       - (Subtraction)
        //       * (Multiplication)
        //       / (Division)
        //       % (Modulus) | Modulus - Remainder

        int a = 10;
        int b = 10;
//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a/b);
//        System.out.println(a%b);
//        System.out.println(a*b);s

        System.out.println(-10 % 3);
        System.out.println(10 % 3);
        System.out.println(7 / 2 * 3);
        System.out.println(7 / (2 * 3));
        System.out.println(7 / (2 * 3+0));
        System.out.println(5 /(2*3));
        System.out.println(a++ + ++a);
        System.out.println(0/5);
//        System.out.println(number/0);

    }
}
