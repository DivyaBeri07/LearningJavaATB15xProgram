package ex_Lab003_Constants;
/*- Special variable whose **value can't be modified during the program execution.**
- One created and SET THE VALUE , we will not able to modify.
-Constant is also called as **final** variable.

How to Define Constants ?
- Use the `final` keyword.
- Commonly declared as `public static final`  for global usage.
- Naming convention: **UPPERCASE_WITH_UNDERSCORES**
example: final int MAX_USERS = 100;
 */

public class Lab011_Define_Constants {

    public static void main(String[] args) {

        final int MEM_LIST = 12;

        System.out.println(MEM_LIST);

    }
}

