package people;


import selectCourse.Course;

public class Student extends Person {
    public Course[] CourseList = new Course[2];
    public String major;

    public Student(int number, String name, int age, String major, String sex) {
        super(number, name, age, sex);
        this.major = major;
    }

    public void setCourse(Course[] s) {
        this.CourseList = s;
    }

    public String toString() {
        return "Student:   学号：" + number + "   姓名:" + name + "   年龄:" + age + "   专业:" + major + "   性别：" + sex;
    }
}

 
	