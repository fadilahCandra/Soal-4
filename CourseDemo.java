/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal4;

/**
 *
 * @author ASUS
 */
public class CourseDemo {

  public static void main(String[] args) {
       Instructor myInstructor = new Instructor("t01", "Slamet", "Ab0g0");
       
       TextBook myTextBook = new TextBook("Terakhir", "Budi", "Awal");
       
       Course myCourse = new Course("Omaewa", myInstructor, myTextBook);
       
       System.out.println(myCourse);
    }
    
}
