import java.util.Scanner;

public class Pages {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Age:");
        int age = scanner.nextInt();
        System.out.println("You should read at least " + (100-age) + " pages of a book before you give up");
    }
}
