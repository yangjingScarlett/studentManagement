package cn.yang.studentManagement.service.impl;

import cn.yang.studentManagement.dao.TeachingCourseDetailMapper;
import cn.yang.studentManagement.domain.TeachingCourseDetail;
import cn.yang.studentManagement.service.TeachingCourseDetailService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 上海万达小额贷款有限公司
 * Created by 杨静 on 2017/10/31
 */
public class TeachingCourseDetailServiceImpl implements TeachingCourseDetailService {

    @Autowired
    private TeachingCourseDetailMapper teachingCourseDetailDao;

    @Override
    public List<TeachingCourseDetail> findAll() {
        return teachingCourseDetailDao.findAll();
    }
}
