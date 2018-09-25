package com.andrei.lab1;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {


        Student st1 = new Student("ba", 5, 10);
        University uni = new University("bla", 5);

        uni.addStudent(st1);

    }

}

    class Student {
        private String nameS;
        private int ageS;
        private int markS;

        private Student() {
            nameS = null;
            ageS = 0;
            markS = 0;
        }

        public Student(String name, int age, int mark) {
            nameS = name;
            ageS = age;
            markS =mark;
        }

    }

        class University {
        private String Name;
        private int FoundationYear;
        public List<Student> lista_studenti = new ArrayList<>();

        public University(String nameu, int FY){
            Name = nameu ;
            FoundationYear = FY;
        }

        public void addStudent( Student st){

            lista_studenti.add(st);

        }
}