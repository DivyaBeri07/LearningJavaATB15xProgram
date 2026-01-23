package ex_Lab004_Literals;

public class Lab016_Literals_Char {
    public static void main(String[] args) {
        char c1 = 'A';
        // A to Z, a-z, !@#$%^&*()_+
        // char c = "A"; String - "" - bunch of chars.
        char c2 = 'B';
        System.out.println(c2);
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space

        // Escape Sequence
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("SreeDivyaTejaBeri");
        System.out.println("Sree"+new_line+"DivyaTeja");
        System.out.println("Sree\nDivyaTejaBeri");
        System.out.println("Sree"+tab_line+"DivyaBeri");
        System.out.println("Sree"+back_space+"teja");
        System.out.println("Teja"+carriage_return+"sree");

        System.out.println( " ----- ");

        System.out.println("Hi, This is a First line"+new_line+"This is second line\nThis is Third line");



        char c10 = 'A';
        //  // ASCII, (limited numbers) - A -> 65


        char ruppes = '₹';
        System.out.println(ruppes);


        char my_emoji_smily = '\u1f60'; // :)
        System.out.println(my_emoji_smily);

        char c11  = '\u1F60';




        int binary = 0b1010;
        int hex = 0xFF;
        long amount = 1_00_000L;
        System.out.println(amount);

        // char A  = "10";
        char c = 'A'; // 65
        System.out.println(c);
    }
}
