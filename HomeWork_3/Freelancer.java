package OOP_JAVA.HomeWork_3;

/**
 * TODO: Спроектировать класс Freelancer самостоятельно в рамках домашнего задания.
 *  *20*8
 */
public class Freelancer extends Employee {

    public Freelancer(String name, String surname, Integer salary, Integer age) {
        super(name, surname, salary, age);
    }

    @Override
    public int calculateAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Совокупный уровень зп (час*ставку):  %d (руб.)  %d лет",
                surname, name, salary, calculateAge());
    }
}
