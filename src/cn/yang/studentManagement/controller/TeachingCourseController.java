package cn.yang.studentManagement.controller;

import cn.yang.studentManagement.dao.TeachingCourseDetailMapper;
import cn.yang.studentManagement.dao.TeachingCourseMapper;
import cn.yang.studentManagement.domain.TeachingCourse;
import cn.yang.studentManagement.domain.TeachingCourseDetail;
import cn.yang.studentManagement.service.TeachingCourseDetailService;
import cn.yang.studentManagement.service.TeachingCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 上海万达小额贷款有限公司
 * Created by 杨静 on 2017/10/31
 */
@Controller
public class TeachingCourseController {

    @Autowired
    private TeachingCourseService teachingCourseService;

    @RequestMapping("/findAll")
    public String findAllTc(Model model) {
        List<TeachingCourse> teachingCourseDetails = teachingCourseService.findAll();
        model.addAttribute("list", teachingCourseDetails);
        return "queryList";
    }
}
