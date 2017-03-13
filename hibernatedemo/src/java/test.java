/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class test {
    public static void main(String []args){
        Student st=new Student("Aditya", "Sri", 20);
        StudentDAO d=new StudentDAO();
        d.addMember(st);
        System.out.println("hello adi data is added successfully");
    }
}
