package TaskManager;

import java.util.List;

public interface TaskManager {
    int getSize();
    List getTaskList();
    Task getTask(int id);
    void addTask(String name);
    void updateName(int id, String name);
    void updateStatus(int id, String status);
    void deleteTask(int id);

}
