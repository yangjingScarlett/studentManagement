package cn.yang.studentManagement.service.impl;

import cn.yang.studentManagement.dao.TeachingCourseMapper;
import cn.yang.studentManagement.domain.TeachingCourse;
import cn.yang.studentManagement.service.TeachingCourseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 上海万达小额贷款有限公司
 * Created by 杨静 on 2017/10/31
 */
public class TeachingCourseServiceImpl implements TeachingCourseService {

    @Autowired
    private TeachingCourseMapper teachingCourseDao;

    @Override
    public List<TeachingCourse> findAll() {
        return teachingCourseDao.findAll();
    }
}
