package OOP_JAVA.HomeWork_3;
public abstract class Employee implements Comparable<Employee> {

    protected String name;
    protected String surname;
    protected Integer salary; 
    public Integer age;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getSalary() {
        return salary;
    }

    public Employee(String name, String surname, Integer salary, Integer age) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.age = age;
    }

    /**
     * Расчет среднемесячной заработной платы
     * @return
     */

    public abstract int calculateAge();

    @Override
    public int compareTo(Employee o) {
        int res = name.compareTo(o.name);
        if (res == 0)
            return Double.compare(calculateAge(), o.calculateAge());
        else
            return res;
    }
}