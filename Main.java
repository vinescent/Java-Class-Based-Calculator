import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        enum calcMode {STANDARD, SCIENTIFIC}
        calcMode type;

        boolean repeat = true;

        Calculator calc;

        while(repeat) {
            System.out.print("What mode do you want (N)ormal or (S)cientific: ");
            String mode = kb.nextLine().toUpperCase();

            switch (mode) {
                case "N":
                    calc = new StandardCalculator();
                    type = calcMode.STANDARD;
                    break;
                case "S":
                    calc = new ScientificCalculator();
                    type = calcMode.SCIENTIFIC;
                    break;
                default:
                    System.out.println("Invalid mode. Please try again.");
                    continue;
            }

            System.out.print("\nOperation? (A)ddition, (S)ubtraction, (M)ultiplication, or (D)ivision: ");
            String operation = kb.nextLine().toUpperCase();

            System.out.print("\nFirst number? ");
            double x = kb.nextDouble();

            System.out.print("\nSecond Number? ");
            double y = kb.nextDouble();

            kb.nextLine(); // Consume the leftover newline
            
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

            System.out.print("\nAnswer: " + calc.format(answer));

            String again;

            do {
                System.out.print("\nAgain? (Y)es or (N)o: ");
                again = kb.nextLine().trim().toUpperCase();
            } while (!again.equals("Y") && !again.equals("N"));

            repeat = again.equals("Y");
        }

        System.out.println("Program stopped.");
    }
}