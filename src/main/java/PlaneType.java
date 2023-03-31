public enum PlaneType {
    BOEING747(10,500),
    BOEING769(15, 1000),
    BOEING420(10, 400);

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

    public double bagsPerPassenger (Plane planeType){
        return (0.5 * weight)/capacity;
    }


}
