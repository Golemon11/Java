package OOP_JAVA.HomeWork_3;

import java.util.Arrays;
import java.util.Random;

public class Program {

    static Random random = new Random();

    /**
     * TODO: Переработать метод generateEmployee в рамках домашнего задания,
     *  метод должен генерировать рабочих (Employee + Freelancer) разных типов.
     * @return
     */
    
     static void generateEmployee( ){ 
        Employee[] employees = new Employee[10];
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        
        for (int i = 0; i < employees.length; i++){
        Integer age = random.nextInt(50);
        int salary = random.nextInt(20000);
        int typeEmployee = random.nextInt(2);
            if (typeEmployee==0) employees[i] = new Freelancer(names[random.nextInt(names.length)], surnames[random.nextInt(3)], salary, age);
            else employees[i] = new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(3)], salary, age);
        }
        Arrays.sort(employees); // new SalaryComparator()

        for(Employee employee : employees){
            System.out.println(employee);
        }
    }
    /**
     * TODO: Придумать новые состояния (age) для наших сотрудников
     *  Придумать Comparator по имени и возрасту 
     * @param args
     */
    public static void main(String[] args) {
        generateEmployee();

    }

}
