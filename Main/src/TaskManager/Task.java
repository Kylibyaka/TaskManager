package TaskManager;

public interface Task {
    enum  status {open, during, closed};
    int getId();
    String getName();
    status  getStatus();

}
