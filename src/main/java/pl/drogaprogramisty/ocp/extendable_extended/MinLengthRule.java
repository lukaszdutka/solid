package pl.drogaprogramisty.ocp.extendable_extended;

class MinLengthRule implements CommentValidatorRule {
    private final int minLength;

    public MinLengthRule(int minLength) {
        this.minLength = minLength;
    }

    @Override
    public boolean validate(String comment) {
        return comment.length() >= minLength;
    }
}
