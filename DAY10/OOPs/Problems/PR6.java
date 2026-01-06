package DAY10.OOPs.Problems;

import java.util.Scanner;

class course{
    private String name;
    course(String name){
        this.name = name;
    }
    void dispaly(){
        System.out.println(name);
    }
}
class Department{
    private String name;
    private course[] courses;
    Department(String name){
        this.name = name;
        System.out.println(name);
    }
    void showcourse(){
        if(courses == null){
            courses = new course[4];
            String[] courseNames = {
                    "cse",
                    "mech",
                    "ece",
                    "civil"
            };
            for(int i = 0;i<courses.length;i++){
                courses[i] = new course(courseNames[i]);
            }
        }
        for(course i: courses){
            i.dispaly();
        }
    }
}
public class PR6 {
    static void main(String[] args) {

        Department obj = new Department("Btech");
        obj.showcourse();


    }
}
