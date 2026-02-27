package ex_Lab006_TypeCasting;

public class Lab0032_Narrowing {
    public static void main(String[] args) {
        /*
          Narrowing Casting (Explicit / Manual)
          You must explicitly specify the target type.
         */

        long l = 256;
        int value = (int) l; // this explicitly we are doing


        System.out.println(l);
        System.out.println(value);
    }
}
