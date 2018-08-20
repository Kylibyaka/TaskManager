package TaskManager;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Артем
 */
public class ConsoleMenu {

    private int id;
    private boolean exit;
    private String taskName;
    private Scanner in;
    private Scanner forInt;
    private Scanner forString;
    private TaskManager tm;


    public ConsoleMenu(TaskManager tm){
        exit = false;
        in = new Scanner(System.in);
        forInt = new Scanner(System.in);
        forString = new Scanner(System.in);
        this.tm = tm;
    }


    void menu(){

        while(!exit){
            System.out.println("1. Show task's list\n" +
                    "2. Add new task\n" +
                    "3. Delete task\n" +
                    "4. Change name of task\n" +
                    "5. Change the status of the task");
            System.out.println("Select number in the list or exit");
            String currentLine = in.nextLine();
            switch(currentLine){
                case "1":
                    this.show();
                    break;
                case "2":
                    this.add();
                    break;
                case "3":
                    this.delete();
                    break;
                case "4":
                    this.changeName();
                    break;
                case "5":
                    this.changeStatus();
                    break;
                case "exit":
                    System.out.println("До свидания");
                    exit = true;
                    break;
                 default:
                     System.out.println("Неизвестная команда. Повторите попытку.");
                     break;
            }
        }
    }

    void add(){
        System.out.println("Введите имя задачи: ");
        taskName = forString.nextLine();
        tm.addTask(taskName);
        tm.getTaskList();
    }

    void show(){
        tm.getTaskList();
        if (tm.getSize() != 0) {
            System.out.println("------------------------------------");
            for (int i = 0; i < tm.getSize(); i++) {
                System.out.println("Задача №: " + (i + 1) + " Название: " + tm.getTask(i).getName() + " Статус: " + tm.getTask(i).getStatus());
            }
            System.out.println("------------------------------------");
        }
        else
            System.out.println("\nСписок пуст\n");
    }

    void delete(){
        if(tm.getSize() > 0){
            show();
            System.out.println("Введите номер удаляемой задачи: ");
            id = forInt.nextInt();
            if(tm.getTask(id-1) != null)
                tm.deleteTask(id);
            else {
                System.out.println("Неправильный номер");
            }
        }
        else
            System.out.println("\nСписок задач пуст.\n");
    }

    void changeName(){
        if(tm.getSize() > 0){
            show();
            System.out.println("Введите номер задачи: ");
            id = forInt.nextInt();
            if (tm.getTask(id-1) != null) {
                System.out.println("Введите новое имя задачи: ");
                taskName = forString.nextLine();
                tm.updateName(id, taskName);
            }
            else
                System.out.println("Неправильный номер");

        }
        else
            System.out.println("\nСписок задач пуст.\n");
    }

    void changeStatus(){
        if(tm.getSize() > 0){
            show();
            System.out.println("Введите номер задачи: ");
            id = forInt.nextInt();
            if(tm.getTask(id-1) != null) {
                System.out.println("Выберите новый статус для задачи: \n 1.Открыта \n 2.В процессе \n 3.Закрыта");
                int k = forInt.nextInt();
                Task.status st;
                switch (k) {
                    case 1:
                        st = Task.status.open;
                        break;
                    case 2:
                        st = Task.status.during;
                        break;
                    case 3:
                        st = Task.status.closed;
                        break;
                    default:
                        st = Task.status.open;
                        break;
                }
                tm.updateStatus(id, st.toString());
            }
            else
                System.out.println("Неправильный номер.");
        }
        else
            System.out.println("\nСписок задач пуст.\n");
    }



}

