import java.util.Scanner;

public class Main {
    private enum CalcMode {
        STANDARD, SCIENTIFIC
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        boolean repeat = true;

        while (repeat) {
            Calculator calc;
            CalcMode type;

            System.out.print("What mode do you want (N)ormal or (S)cientific: ");
            String mode = kb.nextLine().trim().toUpperCase();

            switch (mode) {
                case "N":
                    calc = new StandardCalculator();
                    type = CalcMode.STANDARD;
                    break;
                case "S":
                    calc = new ScientificCalculator();
                    type = CalcMode.SCIENTIFIC;
                    break;
                default:
                    System.out.println("Invalid mode. Please try again.");
                    continue;
            }

            System.out.print(
                "\nOperation? (A)ddition, (S)ubtraction, (M)ultiplication, or (D)ivision: "
            );
            String operation = kb.nextLine().trim().toUpperCase();

            double x = readDouble(kb, "\nFirst number? ");
            double y = readDouble(kb, "\nSecond number? ");

            double answer;

            switch (operation) {
                case "A":
                    answer = calc.add(x, y);
                    break;
                case "S":
                    answer = calc.subtract(x, y);
                    break;
                case "M":
                    answer = calc.multiply(x, y);
                    break;
                case "D":
                    if (y == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        continue;
                    }
                    answer = calc.divide(x, y);
                    break;
                default:
                    System.out.println("Invalid operation. Please try again.");
                    continue;
            }

            System.out.println("\nAnswer: " + calc.format(answer));

            String again;
            do {
                System.out.print("\nAgain? (Y)es or (N)o: ");
                again = kb.nextLine().trim().toUpperCase();
            } while (!again.equals("Y") && !again.equals("N"));

            repeat = again.equals("Y");
        }

        System.out.println("Program stopped.");
        kb.close();
    }

    private static double readDouble(Scanner kb, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = kb.nextLine();

            try {
                double number = Double.parseDouble(input);

                if (Double.isFinite(number)) {
                    return number;
                }

                System.out.println("Please enter a finite number.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid number, please try again.");
            }
        }
    }
}
