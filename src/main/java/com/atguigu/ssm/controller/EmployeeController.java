package com.atguigu.ssm.controller;

import com.atguigu.ssm.pojo.Employee;
import com.atguigu.ssm.service.EmployeeService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Date:2022/12/21
 * Author:YiFan Lee
 * Version:1.0
 * Description:使用RESTful风格
 * 查询所有的员工信息-->/Employee-->get
 * 查询所有的员工的分页信息-->/Employee/page/1-->get
 * 根据id查询员工信息-->/Employee/1-->get
 * 跳转到添加页面-->/to/add-->get
 * 添加员工信息-->/Employee-->post
 * 修改员工信息-->/Employee-->put
 * 删除员工信息-->/Employee/1-->delete
 *
 **/


@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employee" ,method = RequestMethod.GET)
    public String getAllEmployee(Model model){
        //查询所有员工信息
        List<Employee> list =  employeeService.getAllEmployee();
        //将查询到的数据通过model保存在request域
        model.addAttribute("list",list);
        //跳转到employee_list.html
        return "employee_list";
    }

    @RequestMapping(value = "/employee/page/{pageNum}" ,method = RequestMethod.GET)
    public String getAllEmployeeByPage(@PathVariable("pageNum") Integer pageNum,Model model){

        PageInfo<Employee> page =   employeeService.getAllEmployeeByPage(pageNum);

        model.addAttribute("page",page);

        return "employee_list";
    }

}
