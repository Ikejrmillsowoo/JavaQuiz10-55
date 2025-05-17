package rocks.zipcode.io.quiz4.collections;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    private List<Student> students = new ArrayList<>();

    public void enroll(Student student) {
        this.students.add(student);
    }

    public Boolean isEnrolled(Student student) {
        return this.students.contains(student);
    }

    public void lecture(double numberOfHours) {
        for (Student student: students){
             student.learn(numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> study = new HashMap<>();
        for (Student student: students){
            study.put(student, student.getTotalStudyTime());
        }

        return study;
    }
}
