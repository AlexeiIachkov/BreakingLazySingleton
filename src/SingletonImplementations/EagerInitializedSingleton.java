package SingletonImplementations;

public class EagerInitializedSingleton implements Singleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
    private String data_in_singleton;

    // private constructor to avoid client applications using the constructor
    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }

    @Override
    public SingletonType getType() {
        return SingletonType.EAGER;
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