package pl.drogaprogramisty.ocp.extendable_extended;

import java.util.List;

class CommentValidator {
    private final List<CommentValidatorRule> rules;

    public CommentValidator(List<CommentValidatorRule> rules) {
        this.rules = rules;
    }

    public boolean validate(String comment) {
        return rules.stream().allMatch(r -> r.validate(comment));
    }
}
