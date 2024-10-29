package exceptions;

public class MyResource implements AutoCloseable{
    @Override
    public void close() throws Exception {
        ((String) null).length();
    }
}
