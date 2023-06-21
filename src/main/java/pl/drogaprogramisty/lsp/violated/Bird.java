package pl.drogaprogramisty.lsp.violated;

public interface Bird {
    default void fly(){
        System.out.println("I am flying");
    }
}
