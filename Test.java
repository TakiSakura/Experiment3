package selectCourse;

import people.Student;
import people.Teacher;

public class Test {
    public static void main(String[] args) {
        System.out.println("ѧ����Ϣ");
        Student friend = new Student(2020311571, "�Ž���", 21, "��ȫ����", "MAN");
        Student me = new Student(2020311593, "���ĺ�", 20, "������", "MAN");
        System.out.println(friend);
        System.out.println(me);

        System.out.println("��ʦ��Ϣ");
        Teacher b = new Teacher(1, "����", "WOMAN", "���Դ���");
        Teacher d = new Teacher(2, "κޱ", "WOMAN", "��ɢ��ѧ");
        Teacher e = new Teacher(3, "�Ž���", "MAN", "��е���̻���");
        System.out.println(b);
        System.out.println(d);
        System.out.println(e);

        System.out.println("�γ���Ϣ");
        Course[] CourseList1 = new Course[2];
        Course[] CourseList2 = new Course[2];
        Course c = new Course("���Դ���", "MATH201-1", "205", 90f);
        Course f = new Course("��ɢ��ѧ", "CST201-1", "303", 90f);
        Course g = new Course("��е���̻���", "null", "3402", 90f);
        CourseList1[0] = c;
        CourseList1[1] = g;
        CourseList2[0] = c;
        CourseList2[1] = f;
        friend.setCourse(CourseList1);
        me.setCourse(CourseList2);

        System.out.println("ѧ��" + friend.name + "��ѡ�γ�:\n" + friend.CourseList[0] + "\n" + friend.CourseList[1]);
        System.out.println("ѧ��" + me.name + "��ѡ�γ�:\n" + me.CourseList[0] + "\n" + me.CourseList[1]);
    }
}   