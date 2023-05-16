package ns7;

// 3. safe
public class SingletonDemo3 {
    private static SingletonDemo3 instance;

    private SingletonDemo3() {
    }

    public static synchronized SingletonDemo3 getInstance() {
        if (instance == null) {
            instance = new SingletonDemo3();
        }
        return instance;
    }

    public void show() {
        System.out.println("show");
    }

    public static void main(String[] args) {
        SingletonDemo3.getInstance().show();
    }
}
