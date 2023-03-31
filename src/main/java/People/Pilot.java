package People;

public class Pilot extends Person {

    private Rank rank = Rank.PILOT;
    private String licence;

    public Pilot(String name, String licence) {
        super(name);
        this.licence = licence;
    }

    public Rank getRank() {
        return rank;
    }


    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }
}
