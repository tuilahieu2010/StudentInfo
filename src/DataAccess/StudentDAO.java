/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import Common.Library;
import Model.Student;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author hieu
 */
public class StudentDAO {
    private static StudentDAO instance = null;
    Library l;

    public StudentDAO() {
        l = new Library();
    }

    public static StudentDAO Instance() {
        if (instance == null) {
            synchronized (StudentDAO.class) {
                if (instance == null) {
                    instance = new StudentDAO();
                }
            }
        }
        return instance;
    }

    public ArrayList<Student> addStudent(ArrayList<Student> lt) {
        while (true) {
            System.out.println("Please input student information");
            String name = l.inputString("Name: ");
            String classes = l.inputString("Classes: ");
            double mark = l.checkInputDouble("Mark: ");
            lt.add(new Student(name, mark, classes));
            if (!l.checkInputYN("Do you want to enter more student information?(Y/N): ")) {
                return lt;
            }
        }

    }

    public void print(ArrayList<Student> lt) {
        if (lt.isEmpty()) {
            System.err.println("There are no student!!!");
            return;
        }
        Collections.sort(lt);
        for (int i = 0; i < lt.size(); i++) {
            int n = i + 1;
            System.out.println("--------Student " + n + "--------");
            System.out.println("Name: " + lt.get(i).getName());
            System.out.println("Classes: " + lt.get(i).getClasses());
            System.out.println("Mark: " + lt.get(i).getMark());
        }
    }

    public void display(ArrayList<Student> lt) {
        print(addStudent(lt));
    }
}