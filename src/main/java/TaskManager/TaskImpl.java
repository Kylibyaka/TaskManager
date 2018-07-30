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
    private status status;

    public TaskImpl(int id, String name){
        this.id = id;
        this.name = name;
        this.status = Task.status.open;
    }

    public String getName(){
        return this.name;
    }

    public status getStatus(){
        return status;
    }

    public int getId(){ return this.id; }

    void setStatus(String s){
        this.status = Task.status.valueOf(s);
    }

    void setName(String name){
        this.name = name;
    }

}

