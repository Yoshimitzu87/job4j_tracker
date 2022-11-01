package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User t = null;
        for (User user : users) {
            if (login.equals(user.getUsername())) {
                t = user;
                break;
            }
            throw new UserNotFoundException("User not found.");
        }
        return t;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() && user.getUsername().length() < 3) {
            throw new UserInvalidException("User not valid");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException uie) {
            uie.printStackTrace();
        } catch (UserNotFoundException ue) {
            ue.printStackTrace();
        }
    }
}