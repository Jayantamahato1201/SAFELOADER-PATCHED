package y0;

public final class g extends Exception {
    public g(Exception exc) {
        super("Error thrown initializing StaticLayout " + exc.getMessage(), exc);
    }
}
