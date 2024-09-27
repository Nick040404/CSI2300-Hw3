import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to metric converter! \n");
        System.out.println("Please input your query. For example, 1 km = m. \n");
        System.out.println("Enter 'exit' or '-1' to exit the program\n");
       
        Scanner myScanner = new Scanner(System.in);  // Create a Scanner object
        String opt = myScanner.nextLine().trim();  // Read user input
        

        while (!opt.equals("-1") && !opt.equals("exit")) {
            if (opt.equals("1 kg = lb") ) {
                System.out.println("1 kg = " + 2.2 + " lb.");
            }
            else if (opt.equals("1 km = m")) {
                System.out.println("1 km = " + 1000 + " m.");
            }
            else if (opt.equals("1 lb = kg")) {
                System.out.println("1 lb = " + 0.45 + " kg.");
            }
            else {
                System.out.println
                ("Your input is not currently handled by this app, ");
                System.out.println
                ("please input another query, for example, 1 kg = lb");
            }
            opt = myScanner.nextLine().trim();
        }

        myScanner.close(); 
    }
}