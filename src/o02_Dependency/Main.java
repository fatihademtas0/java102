package o02_Dependency;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Fatih", "Tas", "1", "Antalya", 85);
        Student st2 = new Student("Esra", "Akaydın", "2", "Antalya", 85);
        Student st3 = new Student("Osman", "Durmus", "3", "Antalya", 85);

        Student[] students = {st1, st2, st3};

        Instructor teacher = new Instructor("Sezgin", "Irmak", "CENG");

        // course has a teacher (composition)
        Course math = new Course("Math", "math101", teacher);
        System.out.println(math.calcAver(students));

        //System.out.println(teacher.getName());
        System.out.println(math.getInstructor().getName());
    }
}
