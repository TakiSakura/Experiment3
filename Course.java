package selectCourse;

public record Course(String CourseName, String id, String place, float time) {

    public String toString() {
        return CourseName + "     �γ̱�ţ�" + id + "   �Ͽεص㣺" + place + "    �γ�ʱ�䣺" + time + "min";
    }
}