package main.designPattern.abstractFactoryPattern;

public class WebDevFactory extends EmployeeAbstractFactory{
    @Override
    public  Employee createEmployee(){
        return new WebDev();
    }
}
