package main.designPattern.factoryPattern;

public class EmployeeFactory {

    public static Employee getEmployee(String empType) {
        if(empType.trim().equalsIgnoreCase("Android Developer")){
            return new AndroidDev();
        }else if(empType.trim().equalsIgnoreCase("web Developer")){
            return new WebDev();
        }else{
            return  null;
        }


    }
}
