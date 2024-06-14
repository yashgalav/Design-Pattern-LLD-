package main.designPattern.SingletonPattern;
import java.util.*;
public class Main1 {

    public static void main(String[] args) {

        // objects created by Lazy method :
        Somosa somosa = Somosa.getSomosa();
        System.out.println(somosa.hashCode());

        Somosa somosa1 = Somosa.getSomosa();
        System.out.println(somosa1.hashCode());

        //object created by EAGER WAY
        Jalebi jalebi = Jalebi.getJalebi();
        System.out.println(jalebi.hashCode());

        Jalebi jalebi1 = Jalebi.getJalebi();
        System.out.println(jalebi1.hashCode());
    }
}
