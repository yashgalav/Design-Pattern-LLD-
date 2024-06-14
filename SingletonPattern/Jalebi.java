package main.designPattern.SingletonPattern;

public class Jalebi {
    // EAGER WAY of creating single Object
    // 1. Create private static field to store the value
    private static Jalebi jalebi = new Jalebi();

    // 2. make method to get object
    public  static  Jalebi getJalebi(){
        return jalebi;
    }
}
