package syntax.comparator;

import java.util.Comparator;

public class Ideone {

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
    }
}

class Employee {
    int age;
    int salary;
    String name;

    public Employee(int age, int salary, String fio) {
        this.age = age;
        this.salary = salary;
        this.name = fio;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }


    public int compareTo2(Employee o) {
        if(this.age > o.age) {
            return -1;
        } else if(this.age < o.age) {
            return +1;
        } else {
            if(this.salary > o.salary) {
                return -1;
            } else if(this.salary < o.salary) {
                return +1;
            } else {
                return this.name.compareTo(o.name);
            }
        }
    }
}

class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.age > o2.age) {
            return +1;
        } else if(o1.age < o2.age) {
            return -1;
        } else {
            if(o1.salary > o2.salary) {
                return +1;
            } else if(o1.salary < o2.salary) {
                return -1;
            } else {
                return o1.name.compareTo(o2.name);
            }
        }
    }
}
