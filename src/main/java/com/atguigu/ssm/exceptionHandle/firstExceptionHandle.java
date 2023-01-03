package com.atguigu.ssm.exceptionHandle;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Date:2023/1/3
 * Author:YiFan Lee
 * Version:1.0
 * Theme:
 **/
@ControllerAdvice
public class firstExceptionHandle {
    // 处理指定异常的方法
    @ExceptionHandler({ArithmeticException.class})
    public String handleException(Model model, Throwable ex) {
        model.addAttribute("ex", ex);
        return "error";//跳转到error对应的页面error.html
    }
}
