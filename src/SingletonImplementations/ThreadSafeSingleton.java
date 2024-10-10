package SingletonImplementations;

public class ThreadSafeSingleton implements Singleton {

    private static volatile ThreadSafeSingleton instance;
    private String data_in_singleton;

    private ThreadSafeSingleton(){}

    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    @Override
    public SingletonType getType() {
        return SingletonType.THREAD_SAFE;
    }

    @Override
    public String getDataInSingleton() {
        return data_in_singleton;
    }

    @Override
    public void setDataInSingleton(String data_in_singleton) {
        this.data_in_singleton = data_in_singleton;
    }

}