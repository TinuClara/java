import java.util.*;
class WeakPasswordException extends Exception {
    public WeakPasswordException(String message) {
        super(message);
    }
}

class password  {
    public static void validatePassword(String password) throws WeakPasswordException {
        if (password.length() < 8) {
            throw new WeakPasswordException("Password is too short (minimum 8 characters required).");
        }

        if (!password.matches(".*\\d.*")) {
            throw new WeakPasswordException("Password must contain at least one digit.");
        }

        if (!password.matches(".*[A-Z].*")) {
            throw new WeakPasswordException("Password must contain at least one uppercase letter.");
        }

        if (!password.matches(".*[a-z].*")) {
            throw new WeakPasswordException("Password must contain at least one lowercase letter.");
        }

        if (!password.matches(".*[@#$%^&+=].*")) {
            throw new WeakPasswordException("Password must contain at least one special character (@#$%^&+=).");
        }

        // Additional custom conditions can be added as needed

        System.out.println("Password is valid.");
    }

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
			System.out.println("password");
        String password = sc.nextLine();
        
        try {
            validatePassword(password);
        } catch (WeakPasswordException e) {
            System.out.println("Password validation failed: " + e.getMessage());
        }
    }
}