import java.sql.SQLOutput;
import java.util.Arrays;

public class School implements Service {
    private String schoolName;
    private Student[] students;

    public School(String schoolName, Student[] students) {
        this.schoolName = schoolName;
        this.students = students;
    }

    @Override
    public String findByName(String studentName) {
        String sName = null;
        for (Student s: students) {

            if (s.getName().equals(studentName)){
                sName = "есть такое имя:  "+studentName;
                break;
            }else {
                sName = "не найдено! ";
            }

        }
        return "Код отвечает "+ sName;
    }

    @Override
    public void getAllStudents() {
        for (Student s: students
             ) {
            System.out.println(s);

        }

    }

    @Override
    public Student[] getAllGirls() {

        for (int i = 0; i < students.length; i++) {
            if (students[i].getGender().equals("W")){
                System.out.println(students[i]);
            }
        }
        return students;
    }

    @Override
    public void getMaxEstimation() {
        int max =0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getEstimation()>max){
                max = students[i].getEstimation();
                }

        }
        System.out.println(max);
    }

    @Override
    public double getAverageEstimation() {
        double sred =0;
        double sum = 0;
        for (Student s: students
             ) {
             sum += s.getEstimation();

        }
        return sred=sum/6;
    }

    @Override
    public void getAverageAge() {
        double sred =0;
        double sum = 0;
        for (Student s: students
        ) {
            sum += s.getAge();

        }
        System.out.println( sred=sum/6);

    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "School " +
                "schoolName: " + schoolName +
                "students: " + Arrays.toString(students);
    }

}
