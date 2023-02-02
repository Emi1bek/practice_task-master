public class Student {
    private String name;
    private String surname;
    private int age;
    private String gender;
    private String email;
    private int estimation;

    public Student(String name, String surname, int age, String email, String gender, int estimation) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.estimation = estimation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getEstimation() {
        return estimation;
    }

    public void setEstimation(int  estimation) {
        this.estimation = estimation;
    }

    @Override
    public String toString() {
        return "Student: " +
                "name: " + name+
                "surname: " + surname+
                "age: " + age +
                "gender: " + gender+
                "email: " + email+
                "estimation: " + estimation;
    }
}
