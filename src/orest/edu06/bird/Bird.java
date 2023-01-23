package orest.edu06.bird;

public abstract class Bird {
    private boolean feathers;
    private boolean layEggs;
    private boolean fly;

    public Bird() {
        feathers = true;
        layEggs = true;
        fly = true;
    }

    public Bird(boolean feathers, boolean layEggs, boolean fly) {
        this.feathers = feathers;
        this.layEggs = layEggs;
        this.fly = fly;
    }

    public boolean isFeathers() {
        return feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public boolean isFly() {
        return fly;
    }

    public void fly() {
        System.out.println("I can" + (fly ? " " : " not ") + "fly");
    }

    @Override
    public String toString() {
        return "feathers=" + feathers +
                ", layEggs=" + layEggs +
                ", fly=" + fly;
    }
}
