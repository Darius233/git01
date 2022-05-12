package com.xxxx;

import com.xxxx.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@WebServlet("/s02")
public class Servlet02 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //存储布尔类型数据
        req.setAttribute("bool",true);
        //存储日期类型
        req.setAttribute("date",new Date());
        // 数值类型
        req.setAttribute("age",18); // 数值型
        req.setAttribute("salary",10000); // 数值型
        req.setAttribute("avg",0.545); // 浮点型
        // 字符串类型
        req.setAttribute("msg","Hello ");
        req.setAttribute("msg2","freemarker");
        // req.setAttribute("testStr","lbw");

        // 序列类型 （数组、List、Set）
        // 数组操作
        String[] stars = new String[]{"周杰伦","林俊杰","陈奕迅","五月天"};
        req.setAttribute("stars",stars);

        // List操作
        List<String> citys = Arrays.asList("上海","北京","杭州","深圳");
        req.setAttribute("cityList",citys);

        // JavaBean集合
        List<User> userList = new ArrayList<>();
        userList.add(new User(1,"zhangsan",22));
        userList.add(new User(2,"lisi",18));
        userList.add(new User(3,"wangwu",20));
        req.setAttribute("userList",userList);

        // Map操作
        Map<String,String> cityMap = new HashMap<>();
        cityMap.put("sh","上海");
        cityMap.put("bj","北京");
        cityMap.put("sz","深圳");
        req.setAttribute("cityMap",cityMap);

        //跳转到页面中
        req.getRequestDispatcher("02-数据类型.ftl").forward(req,resp);
    }
}
