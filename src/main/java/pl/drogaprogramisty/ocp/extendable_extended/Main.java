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


        List<CommentValidatorRule> communityRules = List.of(
                new MaxLengthRule(200),
                new ForbiddenWordsRule(List.of("dupa", "words", "forbidden", "for", "community"))
        );
        CommentValidator communityCommentValidator = new CommentValidator(communityRules);
        communityCommentValidator.validate("Dobre praktyki podupadają.");

    }
}
