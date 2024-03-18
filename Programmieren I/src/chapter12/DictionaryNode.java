package chapter12;

public class DictionaryNode {
    private final String word;
    private final String description;

    private DictionaryNode right;
    private DictionaryNode left;

    public DictionaryNode(String word, String description) {
        this.word = word;
        this.description = description;
    }

    public String getWord() {
        return word;
    }

    public String getDescription() {
        return description;
    }

    public DictionaryNode getRight() {
        return right;
    }

    public void setRight(DictionaryNode right) {
        this.right = right;
    }

    public DictionaryNode getLeft() {
        return left;
    }

    public void setLeft(DictionaryNode left) {
        this.left = left;
    }
}
