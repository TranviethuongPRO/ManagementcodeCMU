/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author PC
 */
public class Mavenproject2 {
private String studentId;
    private String name;
    private int age;

    public Mavenproject2(String studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }


    public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public void updateName(String newName) { this.name = newName; }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
