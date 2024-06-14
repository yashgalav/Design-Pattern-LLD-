package main.designPattern.SingletonPattern;

public class Somosa {

    // 1. Create private static field to store the value
    private static Somosa somosa = null;

    // 2. make constructor
    private Somosa(){
    }

    // It is LAZY way of creating  single object
    // 3. object create with the help of public method
    public static Somosa getSomosa() {

        // now it is thread safe.
        if(somosa == null){
            synchronized (Somosa.class) {
                if (somosa == null) {
                    somosa = new Somosa();
                }
            }
        }
        return somosa;
    }

}
