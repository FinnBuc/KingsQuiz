public class Dynastie {

    private final String name;
    private King founder;
    private King lastKing;
    private final int numberKings;
    private King[] kings = new King[getNumberKings()];

    public Dynastie(String name, int numberKings) {
        this.name = name;
        this.numberKings = numberKings;
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

    public int getNumberKings() {
        return numberKings;
    }

    public King[] getKings() {
        return kings;
    }
}
