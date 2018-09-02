package TaskManager;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author Артем
 */
public class TaskManagerImpl implements TaskManager{

    private ArrayList<TaskImpl> taskImplList;

    public TaskManagerImpl(){
        taskImplList = new ArrayList<>();
    }

    @Override
    public void addTask(String name){
        int id = taskImplList.size() - 1;
        TaskImpl ts = new TaskImpl(id, name);
        taskImplList.add(ts);
    }

    @Override
    public int getSize(){
        return taskImplList.size();
    }

    @Override
    public TaskImpl getTask(int id){
        return (id >= getSize()) ? null : taskImplList.get(id);
    }

    @Override
    public ArrayList getTaskList(){
        return taskImplList;
    }

    @Override
    public void updateStatus(int id, String status){
        taskImplList.get(id-1).setStatus(status);
    }

    @Override
    public void deleteTask(int id){
        taskImplList.remove(id-1);
    }

    @Override
    public void updateName(int id, String name){
        taskImplList.get(id-1).setName(name);
    }


}
