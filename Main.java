import java.util.Scanner;

public class Main {
    public void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        enum type {STANDARD, SCIENTIFIC}
        boolean repeat = 1;
        
        while(repeat) {
            System.out.print("What mode do you want (N)ormal or (S)cientific: ");
            String mode = kb.nextString;

            switch(mode) {
                case "N":
                    type = STANDARD;
                    break;
                case "S":
                    type = SCIENTIFIC;
                    break;
                default:
                    continue;
                    break;
            }

//            if(mode.equals(N)) {
//                type = STANDARD;
//            } elseif(mode.equals(S)) {
//                type = SCIENTIFIC;
//            } else {
//                continue;
//            }

            System.out.print("\nOperation? (A)ddition, (S)ubtraction, (M)ultiplication, or (D)ivision: ");
            String operation = kb.nextString;

            System.out.print("\nFirst number? ");
            double x = kb.nextDouble;

            System.out.print("\nSecond Number? ");
            double y = kb.nextDouble;

            switch(operation) {
                case "A":
                    System.out.println("Result: " + (x + y));
                    break;
                case "S":
                    System.out.println("Result: " + (x - y));
                    break;
                case "M":
                    System.out.println("Result: " + (x * y));
                    break;
                case "D":
                    if(y != 0) {
                        System.out.println("Result: " + (x / y));
                    } else {
                        System.out.println("Error: Division by zero");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operation");
                    continue;
                    break;
            }
        }
    }
}