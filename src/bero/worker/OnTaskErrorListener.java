package bero.worker;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}