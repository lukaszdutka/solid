package pl.drogaprogramisty.ocp.extendable_extended;

class MaxLengthRule implements CommentValidatorRule {
    private final int maxLength;

    public MaxLengthRule(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public boolean validate(String comment) {
        return comment.length() <= maxLength;
    }
}
