package TaskManager;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Артем
 */
public class TaskManagerImpl implements TaskManager{

    private ArrayList<TaskImpl> taskImplList;

    public TaskManagerImpl(){
        taskImplList = new ArrayList<>();
    }

    public void addTask(String name){
        int id = taskImplList.size() - 1;
        TaskImpl ts = new TaskImpl(id, name);
        taskImplList.add(ts);
    }

    public int getSize(){
        return taskImplList.size();
    }

    public TaskImpl getTask(int id){
        return (id >= getSize()) ? null : taskImplList.get(id);
    }

    public ArrayList getList(){
        return (taskImplList.size() == 0) ? null : taskImplList;
    }

    public void setStatus(int id, String status){
        taskImplList.get(id-1).setStatus(status);
    }

    public void deleteTask(int id){
        taskImplList.remove(id-1);
    }

    public void editTask(int id, String name){
        taskImplList.get(id-1).setName(name);
    }


}