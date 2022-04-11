package maze;

public class Cell {
    private boolean top;
    private boolean right;
    private boolean bottom;
    private boolean left;
    private String word;
    private int index;

    public Cell(boolean top, boolean right, boolean bottom, boolean left, String word, int index) {
        this.top = top;
        this.right = right;
        this.bottom = bottom;
        this.left = left;
        this.word = word;
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isTop() {
        return top;
    }

    public void setTop(boolean top) {
        this.top = top;
    }

    public boolean isRight() {
        return right;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public boolean isBottom() {
        return bottom;
    }

    public void setBottom(boolean bottom) {
        this.bottom = bottom;
    }

    public boolean isLeft() {
        return left;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "top=" + top +
                ", right=" + right +
                ", bottom=" + bottom +
                ", left=" + left +
                ", word='" + word + '\'' +
                ", index=" + index +
                '}';
    }
}
