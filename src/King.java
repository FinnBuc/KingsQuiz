import javax.naming.Name;

public class King {
    private int id;
    private String name;
    private String nickname;
    private int birthYear;
    private int coronationYear;
    private int deductionYear;
    private int deathYear;
    private Dynastie dynastie;

    private String funFact;
    private String rome;

    public King(int id, String name, int birthYear, int coronationYear, int deductionYear, int deathYear, Dynastie dynastie, String funFact) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
        this.birthYear = birthYear;
        this.coronationYear = coronationYear;
        this.deductionYear = deductionYear;
        this.deathYear = deathYear;
        this.dynastie = dynastie;
        this.funFact = funFact;
        this.rome = rome;
    }
    public void setNickname(String name) {
        this.nickname = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getCoronationYear() {
        return coronationYear;
    }

    public int getDeductionYear() {
        return deductionYear;
    }

    public int getDeathYear() {
        return deathYear;
    }

    public Dynastie getDynastie() {
        return dynastie;
    }

    public String getFunFact() {
        return funFact;
    }

    public String getRome() {
        return rome;
    }
}
