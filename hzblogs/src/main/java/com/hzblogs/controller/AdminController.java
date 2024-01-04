package com.hzblogs.controller;

import com.alibaba.fastjson.JSONObject;
import com.hzblogs.bean.Admin;
import com.hzblogs.service.admin.AdminService;
import com.hzblogs.service.model.UserModel;
import com.hzblogs.tool.Constants;
import com.hzblogs.tool.IpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;


@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/login.html")
    public String doLogin() {

        return "/admin/page/login";
    }

    @RequestMapping("/main.html")
    public String doMain(HttpSession session, ModelMap model) {
        int loginAdminId = ((Admin) session.getAttribute(Constants.ADMIN_SESSION)).getId();
        if (loginAdminId <= 0) {
            return "redirect:/admin/login.html";
        }
        Admin admin = adminService.selectAdminById(loginAdminId);
        model.addAttribute("admin",admin);
        return "/admin/index";
    }

    // 登录效验
    @RequestMapping(value = "/dologin.json", method = RequestMethod.POST)
    @ResponseBody
    public String dologin(HttpServletRequest request, HttpServletResponse response, HttpSession session,
                          @RequestParam String adminCode, @RequestParam String adminPassword,
                          @RequestParam String valid,
                          Map<String, Object> map) throws NoSuchAlgorithmException, UnsupportedEncodingException {

        JSONObject obj = new JSONObject();
        String _verifyCodeValue = ((String) session.getAttribute("verifyCodeValue")).toUpperCase();
        // 转换成大写
        valid = valid.toUpperCase();
        if (!_verifyCodeValue.equals(valid)) {
            return this.getError(2,"验证码错误");
        }
        // 效验用户名或密码是否为空
        /* System.out.println("============>  " + autologin); */


        //记录登录ip
        Admin a = new Admin();
        a.setAdminCode(adminCode);
        a.setAdminPassword(adminPassword);
        a = adminService.adminLogin(a);
        if (a == null){
            return this.getError(1,"用户名或密码不正确");
        }
        session.setAttribute(Constants.ADMIN_SESSION, a);
        obj.put("error", 0);
        return obj.toJSONString();
    }
    private String getError(int error,String message) {
        JSONObject obj = new JSONObject();
        obj.put("error", error);
        obj.put("message", message);
        return obj.toJSONString();
    }

}
