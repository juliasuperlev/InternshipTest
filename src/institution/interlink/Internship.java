package institution.interlink;

import institution.University;
import person.Student;

import java.util.ArrayList;

public class Internship {
    private String name;
    private ArrayList<Student> studentsForInternship = new ArrayList<>();
    private Student student;

    public Internship(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getStudents(University university) {
        ArrayList<Student> students = university.getStudents();
        String result = "";
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getKnowledgeLevel().getLevel() > university.getAvarageLevel()) {
                result += students.get(i).getName() + "\n";
            }
        }

        return result;
    }
}
