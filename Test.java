package selectCourse;

import people.Student;
import people.Teacher;

public class Test {
    public static void main(String[] args) {
        System.out.println("学生信息");
        Student friend = new Student(2020311571, "张锦程", 21, "安全工程", "MAN");
        Student me = new Student(2020311593, "熊文豪", 20, "物联网", "MAN");
        System.out.println(friend);
        System.out.println(me);

        System.out.println("教师信息");
        Teacher b = new Teacher(1, "冯媛", "WOMAN", "线性代数");
        Teacher d = new Teacher(2, "魏薇", "WOMAN", "离散数学");
        Teacher e = new Teacher(3, "张建军", "MAN", "机械工程基础");
        System.out.println(b);
        System.out.println(d);
        System.out.println(e);

        System.out.println("课程信息");
        Course[] CourseList1 = new Course[2];
        Course[] CourseList2 = new Course[2];
        Course c = new Course("线性代数", "MATH201-1", "205", 90f);
        Course f = new Course("离散数学", "CST201-1", "303", 90f);
        Course g = new Course("机械工程基础", "null", "3402", 90f);
        CourseList1[0] = c;
        CourseList1[1] = g;
        CourseList2[0] = c;
        CourseList2[1] = f;
        friend.setCourse(CourseList1);
        me.setCourse(CourseList2);

        System.out.println("学生" + friend.name + "所选课程:\n" + friend.CourseList[0] + "\n" + friend.CourseList[1]);
        System.out.println("学生" + me.name + "所选课程:\n" + me.CourseList[0] + "\n" + me.CourseList[1]);
    }
}   