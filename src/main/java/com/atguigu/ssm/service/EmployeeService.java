package com.atguigu.ssm.service;

import com.atguigu.ssm.pojo.Employee;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Date:2022/12/21
 * Author:YiFan Lee
 * Version:1.0
 * Theme:
 **/
public interface EmployeeService {
    /**
     * 查询所有员工信息
     * @return 含有员工实体类的list集合
     */
    List<Employee> getAllEmployee();

    /**
     * 获取员工的分页信息
     * @return
     */
    PageInfo<Employee> getAllEmployeeByPage(Integer pageNum);
}
