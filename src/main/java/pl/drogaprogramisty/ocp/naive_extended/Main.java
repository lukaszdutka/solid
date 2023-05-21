package pl.drogaprogramisty.ocp.naive_extended;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> illegalWords = List.of("kupa");
        List<String> illegalWordsForCommunity = List.of("dupa");
        String comment = "Cywilizacja podupada.";

        CommentValidator commentValidator = new CommentValidator(illegalWords, illegalWordsForCommunity);
        System.out.println(commentValidator.validate(comment, CommentType.COMMUNITY));
    }
}
