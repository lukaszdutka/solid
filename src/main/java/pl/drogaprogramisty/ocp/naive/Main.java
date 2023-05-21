package pl.drogaprogramisty.ocp.naive;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> illegalWords = List.of("kupa");
        String comment = "Myślę, by kupić własnego picKUPA!";

        CommentValidator commentValidator = new CommentValidator(illegalWords);
        System.out.println(commentValidator.validate(comment));
    }
}
