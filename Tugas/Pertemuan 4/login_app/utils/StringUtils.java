package login_app.utils;

public class StringUtils {

    public static String generateNickName(String fullName) {
        String[] nameParts = fullName.split(" ");
        String firstName = nameParts[0];
        String nickname = firstName;
        return nickname;
    }
}
