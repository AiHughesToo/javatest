import java.util.Scanner;


/**
 * Created by lrterry on 10/13/16.
 */
public class Question2 {
    //Ask a user to add in a number, save it to a variable and print out that variable.


    public void addNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int number = scanner.nextInt();

        System.out.println(number);

    }
}
