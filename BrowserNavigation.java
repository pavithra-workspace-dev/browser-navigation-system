import java.util.Scanner;
import java.util.Stack;

public class BrowserNavigation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<String> backStack = new Stack<>();
        Stack<String> forwardStack = new Stack<>();

        String currentPage = "Home"; 
        int choice;

        while (true) {
            System.out.println("\nCurrent Page: " + currentPage);
            System.out.println("1. Visit new page");
            System.out.println("2. Go Back");
            System.out.println("3. Go Forward");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1: 
                    System.out.print("Enter URL to visit: ");
                    sc.nextLine(); 
                    String newPage = sc.nextLine();

                    backStack.push(currentPage);
                    currentPage = newPage;
                    forwardStack.clear(); 
                    System.out.println("Visited: " + currentPage);
                    break;

                case 2: 
                    if (!backStack.isEmpty()) {
                        forwardStack.push(currentPage);
                        currentPage = backStack.pop();
                        System.out.println("Went back to: " + currentPage);
                    } else {
                        System.out.println("No previous page to go back!");
                    }
                    break;

                case 3: 
                    if (!forwardStack.isEmpty()) {
                        backStack.push(currentPage);
                        currentPage = forwardStack.pop();
                        System.out.println("Went forward to: " + currentPage);
                    } else {
                        System.out.println("No forward page available!");
                    }
                    break;

                case 4:
                    System.out.println("Exiting Browser...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
