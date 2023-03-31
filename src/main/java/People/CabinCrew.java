package People;

public class CabinCrew extends Person {

    private Rank rank;

    public CabinCrew(String name, Integer weight,Rank rank) {
        super(name, weight);
        this.rank = rank;
    }
}
