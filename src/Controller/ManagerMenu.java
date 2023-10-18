/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Student;
import Repository.StudentRepository;
import java.util.ArrayList;
/**
 *
 * @author hieu
 */
public class ManagerMenu {
 StudentRepository program;
    ArrayList<Student> lt;

    public ManagerMenu() {
        program = new StudentRepository();
        lt = new ArrayList<>();
    }

    public void run() {
        System.out.println("\nCollection Sort Program");
        program.display(lt);
    }
}
