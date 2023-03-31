package People;

public abstract class Person {

    private String name;

    private Integer weight = 50;

    public Person (String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

}
