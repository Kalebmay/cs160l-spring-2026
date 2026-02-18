package registrar;

import course.Course;
import criteria.StudentStrategy;
import student.Student;

public class Registrar {
    public void enrollStudentToClass(Student student, Course course){
        student.addCourse(course);
    }

    public boolean isStudentValid(Student student, StudentStrategy studentStrategy){
       return studentStrategy.isValid(student);
    }
}
