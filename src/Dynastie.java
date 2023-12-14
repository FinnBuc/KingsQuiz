public class Dynastie {

    private final String name;
    private King founder;
    private King lastKing;
    private King[] kings;

    public Dynastie(String name) {
        this.name = name;
    }

    public void setFounder(King founder) {
        this.founder = founder;
    }

    public void setLastKing(King lastKing) {
        this.lastKing = lastKing;
    }

    public void setKings(King[] kings) {
        this.kings = kings;
    }

    public String getName() {
        return name;
    }

    public King getFounder() {
        return founder;
    }

    public King getLastKing() {
        return lastKing;
    }

    public King[] getKings() {
        return kings;
    }

    public int getKingsLength() {
        return kings.length;
    }
}
