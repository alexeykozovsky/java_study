import java.security.SecureRandom;
import java.util.List;

public class University {
    private List<Student> universityStudents;
    private String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public List<Student> getUniversityStudents() {
        return universityStudents;
    }

    public void setUniversityStudents(List<Student> universityStudents) {
        this.universityStudents = universityStudents;
    }

    public String randomName(int length ) {
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder( length );
        for (int i = 0; i < length; i++)
            sb.append( symbols.charAt( random.nextInt( symbols.length() ) ) );
        return sb.toString();
    }
}
