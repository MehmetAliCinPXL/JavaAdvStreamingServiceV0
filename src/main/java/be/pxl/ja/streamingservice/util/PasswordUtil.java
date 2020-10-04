package be.pxl.ja.streamingservice.util;

import be.pxl.ja.streamingservice.model.Profile;

import javax.swing.text.html.HTMLDocument;
import java.util.regex.Pattern;

public class PasswordUtil {

    private static final String SPECIAL_CHARACTERS = "~!@#$%^&*()_-";

    public static int calculateStrength(String password) {
        int score;
        if (password.length() < 6) {
            score = 0;
        } else if (password.length() <= 10) {
            score = 1;
        } else {
            score = 2;
        }
        if (password.length() >= 6) {
            if (Pattern.compile("[0-9]").matcher(password).find()) {
                score += 2;
            }
            if (Pattern.compile("[a-z]").matcher(password).find()) {
                score += 2;
            }
            if (Pattern.compile("[A-Z]").matcher(password).find()) {
                score += 2;
            }
            CharSequence c = SPECIAL_CHARACTERS;
            if (password.contains(c)) {
				score += 2;
            }
        }
        return score;
    }
}
