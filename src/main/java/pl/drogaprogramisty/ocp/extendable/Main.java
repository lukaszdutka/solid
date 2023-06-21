package pl.drogaprogramisty.ocp.extendable;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CommentValidatorRule> rules = List.of(
                new MaxLengthRule(100),
                new MinLengthRule(5),
                new ForbiddenWordsRule(List.of("dupa"))
        );
        CommentValidator commentValidator = new CommentValidator(rules);

        System.out.println(commentValidator.validate("Dobre praktyki podupadają."));
    }
}
