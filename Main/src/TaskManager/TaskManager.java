package TaskManager;

import java.util.List;

public interface TaskManager {
    int getSize();
    List getList();
    Task getTask(int id);
    void addTask(String name);
    void editTask(int id, String name);
    void setStatus(int id, String status);
    void deleteTask(int id);

}
