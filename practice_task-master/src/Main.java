public class Main {
    public static void main(String[] args) {

        Student[] students1 = {
                new Student("NameStudent1", "SurnameStudent1", 20, "student1@gmail.com", "M", 3),
                new Student("NameStudent2", "SurnameStudent2", 21, "student2@gmail.com", "W", 4),
                new Student("NameStudent3", "SurnameStudent3", 29, "student3@gmail.com", "W", 5),
                new Student("NameStudent4", "SurnameStudent4", 25, "student4@gmail.com", "W", 10),
                new Student("NameStudent5", "SurnameStudent5", 26, "student5@gmail.com", "M", 4),
                new Student("NameStudent6", "SurnameStudent6", 27, "student6@gmail.com", "M", 3),
        };


        School school = new School("SchoolName", students1);
        System.out.println(school.findByName("NameStudent1"));
        System.out.println(school.getAllGirls());
        school.getMaxEstimation();
        System.out.println(school.getAverageEstimation());
        school.getAverageAge();
    }
}