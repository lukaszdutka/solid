package pl.drogaprogramisty.ocp.extendable_extended;

public class MalpaCannotBeThereInCommentValidatorRule implements CommentValidatorRule {
    @Override
    public boolean validate(String comment) {
        return !comment.contains("@");
    }
}
