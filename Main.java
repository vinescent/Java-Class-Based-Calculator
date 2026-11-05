import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        enum type {STANDARD, SCIENTIFIC}
        boolean repeat = true;
        
        while(repeat) {
            System.out.print("What mode do you want (N)ormal or (S)cientific: ");
            String mode = kb.nextLine();

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
            String operation = kb.nextLine();

            System.out.print("\nFirst number? ");
            double x = kb.nextDouble();

            System.out.print("\nSecond Number? ");
            double y = kb.nextDouble();

            
        }
    }
}