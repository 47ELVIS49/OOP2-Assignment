import java.io.Console;

public class LoginApp {
    public static void main(String[] args) {
        // Define the correct username and password
        String correctUsername = "Elvis";
        String correctPassword = "@fibonacci_2025.";

        // Get the system console (used to hide password input)
        Console console = System.console();

        // Check if the console is available
        if (console == null) {
            System.out.println("No console available. Please run this program from the terminal.");
            return;
        }

        // Allow up to 3 login attempts
        int attempts = 0;

        while (attempts < 3) {
            // Ask user to enter username
            String username = console.readLine("Enter username: ");

            // Ask user to enter password and display * instead of characters
            char[] passwordArray = console.readPassword("Enter password: ");
            String password = new String(passwordArray); 

            // Check if both username and password are correct
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login successful!");
                break; // Exit loop if login is successful
            } else {
                System.out.println("Invalid username or password.\n");
                attempts++;
            }

            // If 3 attempts used, deny access
            if (attempts == 3) {
                System.out.println("Too many failed attempts. F**K OFF!");
            }
        }
    }
}
