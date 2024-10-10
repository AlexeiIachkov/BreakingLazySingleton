package SingletonImplementations;

public enum EnumSingleton implements Singleton {

    INSTANCE("Super");

    private String data_in_singleton;

    EnumSingleton(String stuff) {
        this.data_in_singleton = stuff;
    }

    public static Singleton getInstance() {
        return EnumSingleton.INSTANCE;
    }

    @Override
    public SingletonType getType() {
        return SingletonType.ENUM;
    }

    @Override
    public String getDataInSingleton() {
        return this.data_in_singleton;
    }

    @Override
    public void setDataInSingleton(String data_in_singleton) {
        this.data_in_singleton = data_in_singleton;
    }
}
