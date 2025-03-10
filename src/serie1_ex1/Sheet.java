package serie1_ex1;

public class Sheet {
    private String text;

    public Sheet() { }

    public Sheet(String content) {
        this.text = content;
    }

    public void addTextOnPage(String content) {
        this.text = content;
    }

    public String getText() {
        return this.text;
    }
}
