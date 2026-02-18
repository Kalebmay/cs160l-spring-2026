package student;

public class SDSUStudent extends Student {
    public SDSUStudent(Long redId, String name, Double gpa, StudentLevel studentLevel, StudentMajor studentMajor) {
        super(redId, name, gpa, studentLevel, studentMajor);
    }

    @Override
    public StudentType studentType() {
        return StudentType.UNDER_GRAD;
    }
}
