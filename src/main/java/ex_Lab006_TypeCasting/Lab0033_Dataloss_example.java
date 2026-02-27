package ex_Lab006_TypeCasting;

public class Lab0033_Dataloss_example {
    public static void main(String[] args) {
        /*
        Interview Explanation:
        Byte range = -128 to 127 → overflow occurs.
         */
        int value = 130;
        byte b= (byte)value;

        System.out.println(value);
        System.out.println(b);
    }
}

/*
boolean cannot be type cast to or from any other type
 */