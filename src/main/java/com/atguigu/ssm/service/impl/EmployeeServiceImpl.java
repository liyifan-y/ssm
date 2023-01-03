package com.atguigu.ssm.service.impl;

import com.atguigu.ssm.mapper.EmployeeMapper;
import com.atguigu.ssm.pojo.Employee;
import com.atguigu.ssm.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Date:2022/12/21
 * Author:YiFan Lee
 * Version:1.0
 * Theme:
 **/
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private  EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getAllEmployee() {
        return employeeMapper.getAllEmployee();
    }

    @Override
    public PageInfo<Employee> getAllEmployeeByPage(Integer pageNum) {
        //使用分页
        // pageNum->当前页页码 ，4->每页显示4条
        PageHelper.startPage(pageNum,2);

        //查询所有员工信息;
        //Page插件相当于拦截器，在查询的过程中就会自动加上limit，查出所需要的额数据放入List中
        List<Employee> list = employeeMapper.getAllEmployee();

        //获取分页相关数据
        //navigatePages，导航页码，即当前导航中显示几个页码数供选择点击
        PageInfo<Employee> page = new PageInfo<>(list,2);

        return page;
    }
}
