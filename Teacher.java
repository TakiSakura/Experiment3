package people;

public class Teacher extends Person {
    public String lesson;

    public Teacher(int number, String name, String sex, String lesson) {
        super(number, name, sex);
        this.lesson = lesson;
    }

    public String toString() {
        return "Teacher:" + "   编号：" + number + "    姓名：" + name + "   性别：" + sex + "     所授课程：" + lesson;
    }

}