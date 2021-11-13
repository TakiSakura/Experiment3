package selectCourse;

public record Course(String CourseName, String id, String place, float time) {

    public String toString() {
        return CourseName + "     课程编号：" + id + "   上课地点：" + place + "    课程时间：" + time + "min";
    }
}