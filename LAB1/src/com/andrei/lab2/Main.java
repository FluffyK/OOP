package com.andrei.lab2;

public class Main {
    public static void main(String[] args) {
        class Student {
            private String nameS;
            private int age;
            private int mark;

            private Student() {
                nameS = null;
                age = 0;
                mark = 0;
            }

            Student a = new Student("Mihail", 21, 8);
            Student b = new Student("Mirabela", 19, 9);
            Student c = new Student("Ion", 69, 3);
            Student d = new Student("Nicolai", 19, 7);
            Student e = new Student("Stelian", 20, 6);
            Student f = new Student("Efrosinia", 35, 9);
        }
    }
}


//        public class university {
//            private String name;
//            private int foundationYear;
//            private String listofstudents;
//            public university(){
//                name = null ;
//                foundationYear = 0;
//                listofstudents = null;
//            }
//            public university(String name, int foundationYear){
//                this.name = "JUK";
//                this.foundationYear= 1876;
//            }
//            public university(String name, int foundationYear){
//                this.name = "PUT";
//                this.foundationYear= 1955;
//            }
//            public university(String name, int foundationYear){
//                this.name = "TUI";
//                this.foundationYear= 1932;
//            }
//
//        }
//        public static void main(String[] args) {
//    }
//}
//            private String nameS;
//            private int age;
//            private int mark;
//            public student(){
//                nameS=null ;
//                age = 0;
//                mark = 0;
//            }
//            student a= new student("Mihail", 21, 8);
//            student b= new student("Mirabela", 19, 9);
//            student c= new student("Ion", 69, 3);
//            student d= new student("Nicolai", 19, 7);
//            student e= new student("Stelian", 20, 6);
//            student f= new student("Efrosinia", 35, 9);
//
//        }
//    }