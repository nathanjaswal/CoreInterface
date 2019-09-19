// pritamworld
package com.lambton;

public class FirstDay {

    public static void main(String[] args) {

        for (int i = 0; i <= 9; i++){
            System.out.println("Nitin");
        }

        Child firstObj = new Child();
        firstObj.setValues();
        firstObj.display();

        Child secObj = new Child();
        secObj.studentID = 2;
        secObj.studentName = "Ram";
        secObj.display();



    }

}
