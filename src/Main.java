import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Scanner keyboard = new Scanner(System.in);
    public static String userResp = "";
    public static int numResp =0;   //it is the number to be checked
    public static int firstDivisor = 0; // first number found that determines that numResp is not a prime number
    public static int randInt = 0;

    public static void main(String[] args){
        int i,m=0,flag=0;
        Random rand = new Random();

        System.out.println("Would you like to test for prime numbers manually or randomly (M/R).");
        userResp = keyboard.nextLine();
        if (userResp.equalsIgnoreCase("m")) {
            while (true) {
                System.out.println("Input a number to check if it is a prime number.");
                numResp = keyboard.nextInt();
                firstDivisor = 0;
                flag = 0;

                m = numResp / 2;
                if (numResp == 0 || numResp == 1) {
                    System.out.println(numResp + " is not prime number");
                } else {
                    for (i = 2; i <= m; i++) {
                        if (numResp % i == 0) {
                            firstDivisor = i;
                            System.out.println(numResp + " is not a prime number. The first divisor is: " + firstDivisor);
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 0) {
                        System.out.println(numResp + " is a prime number");
                    }
                }
                keyboard.nextLine();
                System.out.println("Would you like to continue (Y/N).");
                userResp = keyboard.nextLine();
                if (userResp.equalsIgnoreCase("y")) {
                    continue;
                } else {
                    // Stop processing
                    break;
                }
            }
        }
        else
        {
            // Automatically generate numbers to test for Prime (between 0 and 250).
            //randInt = rand.nextInt(250);
            System.out.println("Random numbers will be generate to test for being a prime number.");
            while (true) {
                //System.out.println("Input a number to check if it is a prime number.");
                numResp = rand.nextInt(250);
                System.out.println(numResp + " is the randomly chosen number");
                firstDivisor = 0;
                flag = 0;

                m = numResp / 2;
                if (numResp == 0 || numResp == 1) {
                    System.out.println(numResp + " is not prime number");
                } else {
                    for (i = 2; i <= m; i++) {
                        if (numResp % i == 0) {
                            firstDivisor = i;
                            System.out.println(numResp + " is not prime number. The first divisor is: " + firstDivisor);
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 0) {
                        System.out.println(numResp + " is prime number");
                    }
                }
                //keyboard.nextLine();
                System.out.println("Would you like to continue (Y/N)..");
                userResp = keyboard.nextLine();
                if (userResp.equalsIgnoreCase("y")) {
                    continue;
                } else {
                    // Stop processing
                    break;
                }
            }
        }
    }
}
