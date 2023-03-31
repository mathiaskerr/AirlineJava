public enum PlaneType {
    BOEING747(10,50),
    BOEING769(15, 100),
    BOEING420(5, 40);

    private final int capacity;

    private final int weight;

    PlaneType(int capacity, int weight){
        this.capacity = capacity;
        this.weight = weight;
    }


    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }


}
