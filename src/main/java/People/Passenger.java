package People;

public class Passenger extends Person {

    private Integer bagWeight;


    public Passenger(String name, Integer bagWeight) {
        super(name);
        this.bagWeight = bagWeight;
    }


    public Integer getBagWeight() {
        return bagWeight;
    }

    public void setBagWeight(Integer bagWeight) {
        this.bagWeight = bagWeight;
    }
}
