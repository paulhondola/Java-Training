import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File inputFile = new File("date.txt");

        try {
            Scanner input = new Scanner(inputFile);

            int num = input.nextInt();
            input.nextLine(); // consume the newline character
            String line = input.nextLine();
            System.out.println(num);
            System.out.println(line);

            input.close();
        } catch (Exception e) {
            System.out.println("Error reading file");
        }
    }
}
