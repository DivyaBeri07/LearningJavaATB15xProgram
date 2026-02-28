package ex_Lab008_Ifcondition;

public class Lab0036_ifcondn_withCLI {
    public static void main(String[] args) {
        System.out.println("Enter the age via the CLI options\n");
        int age = Integer.parseInt(args[0]);

        if( age > 18){
            System.out.println("You can vote!");
        }else{
            System.out.println("You can't");
        }

    }
}
