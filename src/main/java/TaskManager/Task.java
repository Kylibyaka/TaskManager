package TaskManager;

public interface Task {
    enum  Status {OPEN, DURING, CLOSED};
    int getId();
    String getName();
    Status  getStatus();

}
