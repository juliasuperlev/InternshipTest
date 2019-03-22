package institution;

import person.Student;

import java.util.ArrayList;

public class University {
    private String name;
    private Student student;
    private ArrayList<Student> students = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addStudentFromFile(String fileName) {
        //Implementation is needed
    }

    public void addStudentFromDB(String DBName) {
        //Implementation is needed
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public int getAvarageLevel() {
        int result = 0;
        for (int i = 0; i < students.size(); i++) {
            Student tmp = students.get(i);
            result = result + tmp.getKnowledgeLevel().getLevel();
        }
        return result / students.size();
    }
}
