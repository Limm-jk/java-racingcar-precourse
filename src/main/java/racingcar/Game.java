package racingcar;

import java.util.List;

public class Game {
    private List<Car> cars;
    private int raceCount;

    public Game(List<Car> cars, int raceCount) {
        this.cars = cars;
        this.raceCount = raceCount;
    }

    public void play() {
        for (int i = 0; i < raceCount; i++) {
            moveOneRound();
        }
    }

    private void moveOneRound() {
        for (Car car: cars) {
            car.move();
        }

        System.out.println("");
    }
}
