package people;

public class Teacher extends Person {
    public String lesson;

    public Teacher(int number, String name, String sex, String lesson) {
        super(number, name, sex);
        this.lesson = lesson;
    }

    public String toString() {
        return "Teacher:" + "   ��ţ�" + number + "    ������" + name + "   �Ա�" + sex + "     ���ڿγ̣�" + lesson;
    }

}