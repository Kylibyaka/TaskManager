package TaskManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Артем
 */

public class TaskImpl implements Task{

    private int id;
    private String name;
    private Status status;

    public TaskImpl(int id, String name){
        this.id = id;
        this.name = name;
        this.status = Task.Status.OPEN;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public Status getStatus(){
        return status;
    }

    @Override
    public int getId(){ return this.id; }

    void setStatus(String s){
        this.status = Task.Status.valueOf(s);
    }

    void setName(String name){
        this.name = name;
    }

}

