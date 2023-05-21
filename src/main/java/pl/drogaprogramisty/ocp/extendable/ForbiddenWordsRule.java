package pl.drogaprogramisty.ocp.extendable;

import java.util.List;

class ForbiddenWordsRule implements CommentValidatorRule {
    private final List<String> forbiddenWords;

    public ForbiddenWordsRule(List<String> forbiddenWords) {
        this.forbiddenWords = forbiddenWords;
    }

    @Override
    public boolean validate(String comment) {
        return forbiddenWords.stream().noneMatch(comment::contains);
    }
}
