package classes;

public class Training {
    private int pulse, duration, humanWeight;
    public Training() {}
    public Training(int pulse, int duration, int humanWeight) {
        this.pulse = pulse;
        this.duration = duration;
        this.humanWeight = humanWeight;
    }
    public double calories(){
        //Е = 0,014 × М × t × (0,12 × П - 7)
        return 0.014*humanWeight*duration*(0.12*pulse-7);
    }
    public int getPulse() {
        return pulse;
    }
    public int getDuration() {
        return duration;
    }
    public int getHumanWeight() {
        return humanWeight;
    }
}
