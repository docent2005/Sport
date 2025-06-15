package classes;

public class Box extends Training {
    public Box() {}
    public Box(int pulse, int duration, int humanWeight) {
        super(pulse, duration, humanWeight);
    }
    @Override
    public String toString() {
        return String.format("Тренування: Тривалість: %d хв. Кілокалорій: %.2f",
                getDuration(),
                calories()
        );
    }
}
