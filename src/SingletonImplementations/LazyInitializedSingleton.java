package SingletonImplementations;

public class LazyInitializedSingleton implements Singleton {

    private static LazyInitializedSingleton instance;
    private String data_in_singleton;

    private LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }

    @Override
    public SingletonType getType() {
        return SingletonType.LAZY;
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