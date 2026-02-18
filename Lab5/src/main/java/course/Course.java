package course;

import java.util.List;
import java.util.Set;

public interface Course {
    String courseName();
    List<String> courseDescription();
    Set<String> prerequisites();
}
