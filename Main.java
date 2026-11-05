import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        enum calcMode {STANDARD, SCIENTIFIC}
        calcMode type;

        boolean repeat = true;
        
        while(repeat) {
            System.out.print("What mode do you want (N)ormal or (S)cientific: ");
            String mode = kb.nextLine();

            switch (mode) {
                case "N":
                    type = calcMode.STANDARD;
                    break;
                case "S":
                    type = calcMode.SCIENTIFIC;
                    break;
                default:
                    System.out.println("Invalid mode. Please try again.");
                    continue;
                }

//            if(mode.equals(N)) {
//                type = STANDARD;
//            } elseif(mode.equals(S)) {
//                type = SCIENTIFIC;
//            } else {
//                continue;
//            }

            System.out.print("\nOperation? (A)ddition, (S)ubtraction, (M)ultiplication, or (D)ivision: ");
            String operation = kb.nextLine();

            System.out.print("\nFirst number? ");
            double x = kb.nextDouble();

            System.out.print("\nSecond Number? ");
            double y = kb.nextDouble();

            switch (operation) {
                case "A":
                    
                    break;
                case "S":

                    break;
                case "M":

                    break;
                case "D":

                    break;
                default:
                    
                    continue;
            }

            System.out.print("\n");

//            Attempt at switch expression
/*            String answer = switch (operation) {
                case1 -> add(x, y);
                
            }*/
            
        }
    }
}