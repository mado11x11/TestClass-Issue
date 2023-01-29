package com.example.test_class;

import java.util.List;

public class Main {

    public static void main(String[] args){
        // TODO 自動生成されたメソッド・スタブ
        TestClass testClass =  new TestClass(001,"学生１",12,"テニス部");
        System.out.println("学生1の情報：" + testClass.getClub());

        testClass.setClub("家庭科部");
        System.out.println("学生1の情報：" + testClass.getClub());

        for(int i=0; i<10; i++){
            System.out.println("学生1の年齢：" + testClass.getOld() );
        }

        List<TestClass> studentList = List.of(new TestClass(1, "学生2", 11, "テニス部"),
                new TestClass(1, "学生3", 11, "テニス部"),
                new TestClass(1, "学生4", 11, "家庭科部"));

        for(TestClass student : studentList){
            if (student.getClub().equals("家庭科部")){
                System.out.println("家庭科部の学生　：　" + student.getStudentName());
            }
        }


    }

}
