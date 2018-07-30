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
public class TaskApplication {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) throws Exception {
        TaskManager tm = new TaskManagerImpl();
        ConsoleMenu mm = new ConsoleMenu(tm);
        mm.menu();

    }
}




