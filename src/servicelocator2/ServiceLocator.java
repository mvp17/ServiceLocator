package servicelocator2;

public interface ServiceLocator {
    <T> void setService(Class<T> klass, FactoryT<T> factoryT) throws LocatorError;
    <T> void setConstant(Class<T> klass, T value) throws LocatorError;
    <T> T getObject(Class<T> klass) throws LocatorError;
}
