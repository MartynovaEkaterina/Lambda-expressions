package task2Worker;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
