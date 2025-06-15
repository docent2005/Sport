package classes;

public class Crossfit extends Training {
    private int weight;
    public Crossfit() {}
    public Crossfit(int pulse, int duration, int humanWeight, int weight) {
        super(pulse, duration, humanWeight);
        this.weight = weight;
    }
    @Override
    public String toString() {
        return String.format("Кросфіт тренування: Тривалість: %d хв. Вага снаряду : %d кг. Кілокалорій: %.2f",
                getDuration(),
                weight,
                calories()
        );
    }

}
