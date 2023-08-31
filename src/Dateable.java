import java.util.Scanner;

public class Dateable {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Age:");
        int age = scanner.nextInt();
        int divide = (age/2);
        System.out.println("You should only date " + (7+divide) + " year olds or above");
    }

}
