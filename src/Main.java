import classes.*;

public class Main {
    public static void main(String[] args) {
        Training[] trainings;
        trainings = new Training[]{
                //пульс, тривалість, вага людини, дистанція
                new Run(84, 60, 90, 10),
                new Run(79, 58, 89, 11),
                //вага снаряду
                new Crossfit(88, 30, 90, 100),
                new Box(90, 120, 92)
        };
        for (Training training : trainings) {
            System.out.println(training);
        }
//        Згідно ТЗ треба масив, але я б зробив колекцією:
//        ArrayList<Training> trainingList = new ArrayList<Training>();
//        trainingList.add(new Run(84, 60, 90, 10));
//        trainingList.add(new Run(79, 58, 89, 11));
//        trainingList.add(new Crossfit(88, 30, 90, 100));
//        trainingList.add(new Box(90, 120, 92));
//        for (Training training : trainingList) {
//            System.out.println(training);
//        }
    }
}