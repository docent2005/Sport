package classes;

public class Run extends Training {
    private int distance;
    public Run() {}
    public Run(int pulse, int duration, int humanWeight, int distance) {
        super(pulse, duration, humanWeight);
        this.distance = distance;
    }
    @Override
    public String toString() {
        return String.format("Біг: Тривалість: %d хв. Дистанція : %d км. Кілокалорій: %.2f",
                getDuration(),
                distance,
                calories()
        );
    }

}