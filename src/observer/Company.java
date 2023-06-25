package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Company {
    private static Random random = new Random();
    private String nameCompany;
    private double maxSalary;
    private List<Vacansy> vacansies = new ArrayList<>();
    private Publisher jobAgency;

    public Company(String nameCompany, double maxSalary, Publisher jobAgency) {
        this.nameCompany = nameCompany;

        if (maxSalary < 10000) this.maxSalary = 10001;
        else this.maxSalary = maxSalary;
        setVacansies();

        this.jobAgency = jobAgency;
    }

    private void setVacansies() {
        for (int i = 0; i < 2; i++) {
            boolean is = true;
            double salary;
            if (i % 2 != 0) {
                is = true;
                salary = random.nextDouble(2000, 10000);
            } else {
                salary = random.nextDouble(10000, maxSalary);
            };
            vacansies.add(new Vacansy("Vacansy" + i, is, salary));
        }
    }

    public void needEmployer() {
        int index = random.nextInt(0, 1);
        jobAgency.sendOffer(nameCompany, vacansies.get(index).getSalary(), vacansies.get(index).isStudent());
    }
}
