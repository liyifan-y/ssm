package com.atguigu.ssm.mapper;

import com.atguigu.ssm.pojo.Employee;

import java.util.List;

/**
 * Date:2022/12/21
 * Author:YiFan Lee
 * Version:1.0
 * Theme:
 **/
public interface EmployeeMapper {
    /**
     * 查询所有员工信息
     * @return
     */
    List<Employee> getAllEmployee();
}
