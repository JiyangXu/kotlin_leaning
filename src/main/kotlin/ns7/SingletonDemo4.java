package ns7;

// 3. safe
public class SingletonDemo4 {
    private volatile static SingletonDemo4 instance;

    private SingletonDemo4() {
    }

    public static SingletonDemo4 getInstance() {
        if (instance == null) {
            synchronized (SingletonDemo4.class) {
                instance = new SingletonDemo4();
            }
        }
        return instance;
    }

    public void show() {
        System.out.println("show");
    }

    public static void main(String[] args) {
        SingletonDemo4.getInstance().show();
    }
}
