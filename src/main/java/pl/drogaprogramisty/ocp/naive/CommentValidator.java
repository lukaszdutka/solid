package pl.drogaprogramisty.ocp.naive;

import java.util.List;

class CommentValidator {
    private final List<String> illegalWords;

    public CommentValidator(List<String> illegalWords) {
        this.illegalWords = illegalWords;
    }

    public boolean validate(String comment) {
        if (comment.length() < 5 || comment.length() > 100) {
            return false;
        }

        for (String illegalWord : illegalWords) {
            if (comment.contains(illegalWord)) {
                return false;
            }
        }

        //następne warunki

        return true;
    }
}
