package main.designPattern.factoryPattern;

public class DeveloperClient {
    public static void main(String[] args) {
        Employee em  = EmployeeFactory.getEmployee("web developer");
        System.out.print(em.getSalary());
    }
}
