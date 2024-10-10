import SingletonImplementations.*;

public class ThreadBreakerFactory extends ThreadBreaker {
    /*
    This is a Factory Method to create different types of Singleton objects.
     */

    public ThreadBreakerFactory(String threadName, SingletonType type) {
        super(threadName, type);
    }

    @Override
    public Singleton createSingleton(SingletonType type) {
        return switch(type) {
            case SingletonType.EAGER -> EagerInitializedSingleton.getInstance();
            case SingletonType.ENUM -> EnumSingleton.getInstance();
            case SingletonType.LAZY -> LazyInitializedSingleton.getInstance();
            case SingletonType.THREAD_SAFE -> ThreadSafeSingleton.getInstance();
        };
    }
}
