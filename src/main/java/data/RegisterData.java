package data;

public class RegisterData {
    public static final String FIRST_NAME = "Anna";
    public static final String LAST_NAME = "Ivanova";
    public static final String PASSWORD = "Password123!";

    public static final String EMAIL = generateUniqueEmail();

    private static String generateUniqueFirstName() {
        long timestamp = System.currentTimeMillis();
        return "Anna" + timestamp;
    }

    private static String generateUniqueLastName() {
        long timestamp = System.currentTimeMillis();
        return "Ivanova" + timestamp;
    }

    private static String generateUniqueEmail() {
        long timestamp = System.currentTimeMillis();
        return "anna" + timestamp + "@test.com";
    }
}
