package garage.parts.lock;

public class Lock implements ILock {
    private String secret;

    public Lock(String secret){
        this.secret = secret;
    }

    @Override
    public String getSecret() {
        return secret;
    }

    @Override
    public boolean isOpen() {
        return false;
    }
}
