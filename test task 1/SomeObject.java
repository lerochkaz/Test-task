public abstract class SomeObject implements Comparable {
    private String name;
    public int weight;
    public int speed;

    public SomeObject(String name, int maxWeight, int minWeight, int maxSpeed, int minSpeed) {
        this.name = name;
        weight = (int) (Math.random() * (maxWeight - minWeight + 1) + minWeight);
        speed = (int) (Math.random() * (maxSpeed - minSpeed + 1) + minSpeed);
    }

    @Override
    public String toString() {
        return name;
    }

    public void printAboutObject() {
        System.out.println(name + ": вес-" + weight + "кг, скорость-" + speed + "км/ч");
    }

    public int getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }
}
