package pl.drogaprogramisty.ocp.naive_extended;

import java.util.List;

import static pl.drogaprogramisty.ocp.naive_extended.CommentType.COMMUNITY;
import static pl.drogaprogramisty.ocp.naive_extended.CommentType.VIDEO;

class CommentValidator {
    private final List<String> illegalWords;
    private final List<String> illegalWordsForCommunity;

    public CommentValidator(List<String> illegalWords, List<String> illegalWordsForCommunity) {
        this.illegalWords = illegalWords;
        this.illegalWordsForCommunity = illegalWordsForCommunity;
    }

    public boolean validate(String comment, CommentType commentType) {
        if (commentType == VIDEO && (comment.length() < 5 || comment.length() > 100)) {
            return false;
        }
        if (commentType == COMMUNITY && (comment.length() > 200)) {
            return false;
        }

        List<String> illegalWordsToCheck = commentType == VIDEO ? illegalWords : illegalWordsForCommunity;
        for (String illegalWord : illegalWordsToCheck) {
            if (comment.contains(illegalWord)) {
                return false;
            }
        }

        //następne warunki

        return true;
    }
}
