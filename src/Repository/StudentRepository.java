/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import DataAccess.StudentDAO;
import Model.Student;
import java.util.ArrayList;

/**
 *
 * @author hieu
 */
public class StudentRepository implements IStudentRepository{

    @Override
    public void display(ArrayList<Student> lt) {
        StudentDAO.Instance().display(lt);
    }
    
}
