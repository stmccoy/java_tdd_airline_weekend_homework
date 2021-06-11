package Equiptment;

public enum PlaneType {

    BOEING747(100, 500),
    BOEING748(200, 1000),
    BOEING749(300, 2000),
    BOEING750(50,250);

    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight){
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getWeight() {
        return this.weight;
    }
}
