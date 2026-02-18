import course.CS340;
import registrar.Registrar;
import student.Student;
import student.StudentLevel;
import student.StudentMajor;
import student.TransferStudent;

/**
 * Your code has 2 Todos locate them and fix/implement them :) worth 7 points
 *
 * Remember design principle 1.
 *
 * Program to and interface and not an Implementation
 */
public class Lab5Main {
    public static void main(String[] args) {
        //These are just sample code

        //Dont
        TransferStudent nonCompliant = new TransferStudent(1L,"Transfer", 2.9, StudentLevel.FRESHMAN, StudentMajor.math);
        //do
        Student compliant = new TransferStudent(1L,"Transfer", 2.9, StudentLevel.FRESHMAN, StudentMajor.math);

        //with the complaint student you can
        Registrar registrar = new Registrar();

        registrar.enrollStudentToClass(compliant, new CS340());

    }
}
