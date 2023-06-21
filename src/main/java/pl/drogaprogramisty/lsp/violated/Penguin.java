package pl.drogaprogramisty.lsp.violated;

public class Penguin implements Bird {
    @Override
    public void fly() {
        throw new RuntimeException();
    }
}
