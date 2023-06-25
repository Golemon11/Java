package observer;

import java.util.Random;

public class Consultant implements Observer{
    private static Random random = new Random();
    private String name;
    private double minSalary;

    public Consultant(String name) {
        this.name = name;
        minSalary = random.nextDouble(50000, 80000);
    }

    @Override
    public void receiveOffer(String nameCompany, double salary, boolean isStudent) {
        if (minSalary <= salary) {
            System.out.printf("Консультант %s (%f) >>> Мне нужна эта работа! [%s - %f]\n", name, minSalary, nameCompany, salary);
            minSalary = salary;
        } else {
            System.out.printf("Консультант %s (%f) >>> не нужна эта работа! [%s - %f]\n", name, minSalary, nameCompany, salary);
        }
    }
}
