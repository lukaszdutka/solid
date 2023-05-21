package pl.drogaprogramisty.ocp.extendable_extended;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CommentValidatorRule> rules = List.of(
                new MaxLengthRule(100),
                new MinLengthRule(5),
                new ForbiddenWordsRule(List.of("dupa"))
        );
        CommentValidator commentValidator = new CommentValidator(rules);

        commentValidator.validate("Dobre praktyki podupadają.");
    }
}
