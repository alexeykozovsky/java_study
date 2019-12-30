package garage.parts.lock;

public interface ILock {
    String getSecret();

    boolean isOpen();

}
