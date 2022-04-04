import java.util.Scanner;

public class Checker {

    public static void main(String[] args) {
        // Example:
            //String creditCardNumber = "4930798111448417";

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a credit card number: ");
        String creditCardNumber = scan.nextLine().replaceAll(" ", "");

        int oddPositionNumbers = 0;
        int evenPositionNumbers = 0;
        int numbersGreaterThanFour = 0;
        int result;

        for (int i = 0; i < creditCardNumber.length(); i++) {

            char stringNumber  = creditCardNumber.charAt(i);
            int cardDigit = Character.getNumericValue(stringNumber);

            if (i % 2 == 0) {
                oddPositionNumbers += cardDigit*2;

                if (cardDigit > 4) {
                    numbersGreaterThanFour +=1;
                }
            }
            else
            {
                evenPositionNumbers += cardDigit;
            }

        }

        result = (evenPositionNumbers+oddPositionNumbers+numbersGreaterThanFour)%10;
        if (result == 0) {
            System.out.println("The card that you entered was valid.");
        }

        else {
            System.out.println("The card that you entered was not valid.");

        }

    }

}