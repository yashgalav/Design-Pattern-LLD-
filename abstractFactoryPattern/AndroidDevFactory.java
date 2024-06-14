package main.designPattern.abstractFactoryPattern;

public class AndroidDevFactory extends EmployeeAbstractFactory{
    @Override
    public  Employee createEmployee(){
        return new AndroidDev();
    }
}
