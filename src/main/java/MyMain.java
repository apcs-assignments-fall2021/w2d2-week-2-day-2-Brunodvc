import java.util.Scanner;

public class MyMain {
    // Write a method that asks the user to input a double between 0.0 and 1000000.0
    // Your method should keep asking them until they type in a valid value
    // The method returns the final double they type in
    // scan.nextDouble() might be useful here
    public static double inputDouble() {
        Scanner scan = new Scanner(System.in);
        System.out.println("give me a double");
        double input = scan.nextDouble();
        while (input < 0.0 || input >1000000.0){
            System.out.println("give me another double");
            input = scan.nextDouble();
        }

        return -1.0;
    }

    // Takes a double money as input and returns the number of quarters that we
    // can return in change
    // You should use a while loop!
    public static int numQuarters(double money) {
        int quarter = 0;
        while(money >=.25){
            money = money- .25;
            quarter ++;
        }
        return quarter;
    }

    // Takes a double money as input and returns the number of dimes that we
    // can return in change
    // You should use a while loop!
    public static int numDimes(double money) {
        int dimes = 0;
        while (money >= 0.1){
            money = money - 0.1;
            dimes ++;
        }
        return dimes;
    }





    //  Takes in two Strings as input and returns a String equal to those two Strings added
    //  together in alphabetic order.
    public static String stringOrder(String str1, String str2) {
        return "";
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // You should test inputDouble yourself!
        double d = inputDouble();

        // Some code to test numQuarters
        System.out.println("\nnumQuarters tests:");
        System.out.println("1.25 in quarters would be: " + numQuarters(1.25) + " quarters."); // 5
        System.out.println("10.55 in quarters would be: " + numQuarters(10.55) + " quarters."); // 42
        System.out.println("1000000.20 in quarters would be: " + numQuarters(1000000.20) + " quarters."); //4000000

        // Some code to test numDimes
        System.out.println("\nnumDimes tests:");
        System.out.println("1.20 in dimes would be: " + numDimes(1.20) + " dimes."); // 12
        System.out.println("120.13 in dimes would be: " + numDimes(120.13) + " dimes."); //1201
        System.out.println("150.25 in dimes would be: " + numDimes(150.25) + " dimes."); //1502

        scan.close();
    }
}