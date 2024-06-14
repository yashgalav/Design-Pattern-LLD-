package main.designPattern.abstractFactoryPattern;

public class DeveloperClient {
    public static void main(String[] args) {
        Employee em  = EmployeeFactory.getEmployee(new AndroidDevFactory());
        System.out.print(em.getSalary());
    }
}
