package com.softserve.homework6;

public class BirdApp {

    public static void main(String[] args) {
        Bird[] birds = createBirds();
        output(birds);
    }

    private static void output(Bird[] birds) {
        for (Bird bird : birds) {
            System.out.println(bird.getClass().getSimpleName() + " " + bird.fly());
        }
    }

    private static Bird[] createBirds() {
        Bird eagle = new Eagle();
        Bird swallow = new Swallow();
        Bird penguin = new Penguin();
        Bird chicken = new Chicken();
        return new Bird[]{eagle, swallow, penguin, chicken};
    }
}
