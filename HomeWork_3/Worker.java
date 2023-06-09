package OOP_JAVA.HomeWork_3;

public class Worker extends Employee {

    public Worker(String name, String surname, Integer salary, Integer age) {
        super(name, surname, salary, age);
    }

    @Override
    public int calculateAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячная заработная плата (фиксированная месячная оплата):  %d (руб.)  %d лет",
                surname, name, salary, calculateAge());
    }
}
