package cn.yang.studentManagement.dao;

import cn.yang.studentManagement.domain.TeachingCourse;

import java.util.List;

public interface TeachingCourseMapper {

    List<TeachingCourse> findAll();
}