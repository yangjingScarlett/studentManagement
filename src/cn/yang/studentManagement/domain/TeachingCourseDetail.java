package cn.yang.studentManagement.domain;

/**
 * 上海万达小额贷款有限公司
 * Created by 杨静 on 2017/10/31
 */
public class TeachingCourseDetail extends TeachingCourse {

    private Courses course;
    private Teachers teacher;

    public Courses getCourse() {
        return course;
    }

    public void setCourse(Courses course) {
        this.course = course;
    }

    public Teachers getTeacher() {
        return teacher;
    }

    public void setTeacher(Teachers teacher) {
        this.teacher = teacher;
    }

}
