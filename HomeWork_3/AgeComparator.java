package OOP_JAVA.HomeWork_3;


import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        // 1 0 -1
        return Double.compare(o2.calculateAge(), o1.calculateAge());
        //return o1.calculateSalary() == o2.calculateSalary() ? 0 : (o1.calculateSalary() > o2.calculateSalary() ? 1 : -1);
        

    }
}


