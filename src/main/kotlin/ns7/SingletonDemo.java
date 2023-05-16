package ns7;

// 1.
public class SingletonDemo {
    private static SingletonDemo instance = new SingletonDemo();

    private SingletonDemo() {
    }

    public static SingletonDemo getInstance() {
        return instance;
    }

}
