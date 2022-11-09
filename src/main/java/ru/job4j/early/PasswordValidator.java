package ru.job4j.early;

public class PasswordValidator {
    private static final String[] INVALID_STRINGS = {"qwerty", "12345", "password", "admin", "user"};

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (!(password.length() >= 8 && password.length() <= 32)) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        if (!isUpper(password)) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (!isLower(password)) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (!isDigit(password)) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!isSpecial(password)) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }

        for (String s : INVALID_STRINGS) {
            if (password.toLowerCase().contains(s)) {
                throw new IllegalArgumentException(
                        "Password shouldn't contain substrings: qwerty, 12345, password, admin, user"
                );
            }
        }
        return password;
    }

    private static boolean isLower(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isUpper(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isDigit(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isSpecial(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return true;
            }
        }
        return false;
    }
}