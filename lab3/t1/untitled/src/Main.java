class Employee {
    protected String fullName;
    protected int age;
    protected double salary;

    public Employee(String fullName, int age, double salary) {
        this.fullName = fullName;
        this.age = age;
        this.salary = salary;
    }

    public void Show() {
        System.out.println("Повне ім'я: " + fullName);
        System.out.println("Вік: " + age);
        System.out.println("Заробітна плата: " + salary);
    }
}

class Person extends Employee {
    public Person(String fullName, int age, double salary) {
        super(fullName, age, salary);
    }

    public void Show() {
        super.Show();
    }
}

class Worker extends Employee {
    protected String position;

    public Worker(String fullName, int age, double salary, String position) {
        super(fullName, age, salary);
        this.position = position;
    }

    public void Show() {
        super.Show();
        System.out.println("Посада: " + position);
    }
}

class Engineer extends Worker {
    protected String specialization;

    public Engineer(String fullName, int age, double salary, String position, String specialization) {
        super(fullName, age, salary, position);
        this.specialization = specialization;
    }

    public void Show() {
        super.Show();
        System.out.println("Спеціалізація: " + specialization);
    }
}

public class Main {
    public static void main(String[] args) {
        // Створення масиву об'єктів типу Employee
        Employee[] employees = new Employee[4];

        // Ініціалізація об'єктів різних класів
        employees[0] = new Employee("Іван Петрович", 30, 5000);
        employees[1] = new Person("Олена Іванівна", 35, 6000);
        employees[2] = new Worker("Петро Миколайович", 40, 7000, "Менеджер");
        employees[3] = new Engineer("Михайло Олексійович", 45, 8000, "Інженер", "Програмне забезпечення");

        // Виведення масиву об'єктів
        for (Employee employee : employees) {
            employee.Show();
            System.out.println();
        }
    }
}
