package o02_Dependency;

public class Course {
    private String name;
    private String code;
    private Instructor instructor;

    Course(String name, String code, Instructor instructor) {
        this.name = name;
        this.code = code;
        this.instructor = instructor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    // course uses a student (dependency)
    public int calcAver(Student[] students) {
        int sum = 0;
        for (Student student : students) {
            sum += student.getNote();
        }
        return sum / students.length;
    }

    public Instructor getInstructor() {
        return this.instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}
