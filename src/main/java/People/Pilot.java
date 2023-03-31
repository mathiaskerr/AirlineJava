package People;

public class Pilot extends Person {

    private Rank rank;
    private String licence;

    public Pilot(String name, Integer weight, Rank rank, String licence) {
        super(name, weight);
        this.rank = rank;
        this.licence = licence;
    }
}
