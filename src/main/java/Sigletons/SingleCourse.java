package Sigletons;

import Uni.Course;

public class SingleCourse {
    private Course course;
    public static SingleCourse instace = null;

    public void setCourse(Course course) {
        instace.course = course;
    }

    public Course getCourse() {
        return course;
    }

    private  SingleCourse() {}

    public static SingleCourse Instance(Course course){
        if(instace == null){
            instace = new SingleCourse();
            instace.setCourse(course);
        }

        return instace;
    }
}
