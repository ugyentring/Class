package withArray;
import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        CharStack class1 = new CharStack();
        for (char c : string.toCharArray()) {
            class1.push(c);
        }

        String result = " ";

        for (int i = 0; i < string.length(); i++) {
            result += class1.pop().value;
        }

        System.out.println(result);

        scanner.close();
    }
    
}