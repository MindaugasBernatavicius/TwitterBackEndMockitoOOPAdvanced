package design.patterns.creational.singleton;

public class NaiveLazySingleton {

    private static NaiveLazySingleton instance;

    private NaiveLazySingleton(){}

    public static NaiveLazySingleton getInstance(){
        if(instance == null){
            instance = new NaiveLazySingleton();
        }
        return instance;
    }
}