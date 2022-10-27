import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ObjectSortingLambda {


    public static void main(String[] args) {

        ArrayList<Employee> empList = new ArrayList<Employee>();
        Employee employee1 = new Employee("Hazzim", "A", 1);
        Employee employee2 = new Employee("Pedro", "B", 2);
        Employee employee3 = new Employee("Roman", "C", 3);
        Employee employee4 = new Employee("Antonio", "D", 4);
        Employee employee5 = new Employee("Cesar", "E", 5);
        Employee employee6 = new Employee("Fernando", "F", 6);
        Employee employee7 = new Employee("Esteban", "G", 7);
        Employee employee8 = new Employee("Manuel", "H", 8);
        Employee employee9 = new Employee("Daniel", "I", 9);
        Employee employee10 = new Employee("Luis", "J", 10);
        empList.add(employee1);
        empList.add(employee3);
        empList.add(employee2);
        empList.add(employee4);
        empList.add(employee7);
        empList.add(employee8);
        empList.add(employee5);
        empList.add(employee9);
        empList.add(employee6);
        empList.add(employee10);

        System.out.println("Unsorted List");
        empList.forEach(employee -> System.out.println(employee.toString()));

        Comparator<Employee> compareByAddress = (Employee o1, Employee o2) -> o1.getEmpAddress().compareTo( o2.getEmpAddress() );
        Collections.sort(empList, compareByAddress);
        System.out.println("Sorted List By Address");
        empList.forEach(employee -> System.out.println(employee.toString()));
        Comparator<Employee> compareByName = (Employee o1, Employee o2) -> o1.getEmpName().compareTo( o2.getEmpName() );
        Collections.sort(empList, compareByName);
        System.out.println("Sorted List By Name");
        empList.forEach(employee -> System.out.println(employee.toString()));
        Comparator<Employee> compareById = (Employee o1, Employee o2) -> o1.getEmpID().compareTo( o2.getEmpID() );
        Collections.sort(empList, compareById);
        System.out.println("Sorted List By ID");
        empList.forEach(employee -> System.out.println(employee.toString()));

    }

}
