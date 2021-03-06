package Registration;

import Uni.Course;
import Uni.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * the main app that defines the actions one University database needs
 */
public class RegistrationSystem {





    public RegistrationSystem()
    {

    }

    /**
     * method that registers a student to a course
     * @param course the couse that one student need to be added to
     * @param student the student that will be attending the course
     */
    public void register(Course course , Student student)  {
        try (Connection con = DriverManager
                .getConnection("jdbc:mysql://localhost:3306", "root", "Access0740188658")) {
                String selectedDataBase="USE University";

            String alreadyregisterd="select * from StudentCourse "+
                                    " where StudentId = " + "'"+student.getStudentId()+"'" + " and CourseId = "+"'"+course.getCourseId()+"'";
            Statement stm=null;
            stm=con.createStatement();
            stm.execute(selectedDataBase);
            ResultSet studentenrolled = stm.executeQuery(alreadyregisterd);

            if(!studentenrolled.next()){
                String register ="Insert  into StudentCourse (StudentId, CourseId) VALUES ("+ "'"+student.getStudentId()+"'" + ","
                        + "'"+course.getCourseId()+"'" + ")" ;
                //add studentid and courseid in studentcourse
                int rowcount=stm.executeUpdate(register);

            }
            else
                System.out.println("Student already registered");

        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }



    /**
     * a method that shows all the courses that has free places
     * @return a list of courses that have free places
     */
    public List<Course> retrieveCoursesWithFreePlaces(){
        List<Course> courseList = new ArrayList<>();
        try (Connection con = DriverManager
                .getConnection("jdbc:mysql://localhost:3306", "root", "Access0740188658")) {
            String selectedDataBase="USE University";
            String courses ="Select * from Course ";
            Statement statement = null;
            statement=con.createStatement();
            statement.execute(selectedDataBase);
            ResultSet allcoursesId = statement.executeQuery(courses);
            while(allcoursesId.next()){
                String counter =" Select count(*) From StudentCourse where CourseId = "
                        + allcoursesId.getInt("CourseId");
                //TODO get one number into a resultset or something else
                ResultSet numberOfStudents = statement.executeQuery(counter);
                numberOfStudents.next();
                if(allcoursesId.getInt("MaxEnrollment") <numberOfStudents.getInt(0)){
                    Course parsingCourse = new Course("",null,0,0,null);
                    parsingCourse.setCourseId(allcoursesId.getInt("CourseId"));
                    parsingCourse.setCredits(allcoursesId.getInt("Credits"));
                    parsingCourse.setName(allcoursesId.getString("Name"));
                    parsingCourse.setMaxEnrollment(allcoursesId.getInt("MaxEnrollment"));
                    courseList.add(parsingCourse);
                    parsingCourse=null;
                }
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return courseList;

    }

    /**
     * method that shows all the students that are enrolled in a course
     * @param course the course in question
     * @return a list of students that meet the criteria
     */
    public List<Student> retrieveStudentsEnrolledforaCourse(Course course){
        List<Student> studentList = new ArrayList<>();
        try (Connection con = DriverManager
                .getConnection("jdbc:mysql://localhost:3306", "root", "Access0740188658")) {
            String selectedDataBase="USE University";
            String joins= " select * from University.Student" +
                    " inner join StudentCourse " +
                    "on University.Student.StudentId = StudentCourse.StudentId" +
                    " inner join Course on StudentCourse.CourseId = Course.CourseId" +
                    " where Course.CourseId = "+course.getCourseId();
            Statement stm=null;
            stm=con.createStatement();
            stm.execute(selectedDataBase);
            ResultSet studentsEnrolled= stm.executeQuery(joins);
            while(studentsEnrolled.next()){
                Student parsingStudent = new Student("","",0,0,null);
                parsingStudent.setStudentId(studentsEnrolled.getInt("StudentId"));
                parsingStudent.setFirstname(studentsEnrolled.getString("FirstName"));
                parsingStudent.setLastname(studentsEnrolled.getString("LastName"));
                parsingStudent.setTotalCredits(studentsEnrolled.getInt("Credits"));
                studentList.add(parsingStudent);
                parsingStudent=null;
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return studentList;
    }


}
