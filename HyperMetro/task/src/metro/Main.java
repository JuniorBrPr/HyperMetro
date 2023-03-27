package metro;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File(args[0]))) {
            LinkedList<String> lines = new LinkedList<>();

            lines.add("depot");
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
            lines.add("depot");


            for (int i = 0;i < lines.size();i++) {
                if (i != 0 && i != lines.size() - 1) {
                    System.out.printf(
                            "%s - %s - %s%n",
                            lines.get(i - 1), lines.get(i), lines.get(i + 1)
                    );
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
