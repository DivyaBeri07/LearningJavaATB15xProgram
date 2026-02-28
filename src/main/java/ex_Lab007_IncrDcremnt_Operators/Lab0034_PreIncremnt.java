package ex_Lab007_IncrDcremnt_Operators;

public class Lab0034_PreIncremnt {
    //They are unary operators used to increase or decrease a variable’s value by 1
 /*
Increment Operator (++)
- Prefix Increment : `++variable`
- Postfix Increment : `variable++`
Decrement Operator (--)
- Pre Decrement: --`variable`
- Post Decrement: `variable--`

Pre-Increment : value is incremented first and then stored in the result.
Post-Increment : print first and then increase the value.

 */
    public static void main(String[] args) {
        int a = 10;
        int result = ++a;
        System.out.println(result);
    }
}