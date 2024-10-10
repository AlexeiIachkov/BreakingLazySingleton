package SingletonImplementations;

public interface Singleton {
    static Singleton getInstance() {
        return null;
    }

    SingletonType getType();

    String getDataInSingleton();

    void setDataInSingleton(String data_in_singleton);
}
