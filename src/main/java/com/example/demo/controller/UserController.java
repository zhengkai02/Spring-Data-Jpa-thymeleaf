package com.example.demo.controller;

import com.example.demo.DO.User;
import com.example.demo.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import java.util.List;

/**
 * @author ZhengKai
 * @data 2019-08-25 17:12
 */
@Controller
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/")
    public String index(){
        return "redirect:/list";
    }
    @RequestMapping("/list")
    public String list(Model model){
        List<User> userList=userService.getUserList();
        model.addAttribute("users",userList);
        return "user/list";
    }
    @RequestMapping("/toAdd")
    public String toAdd(){
        return "user/userAdd";
    }
    @RequestMapping("/add")
    public String add(User user){
        userService.save(user);
        return "redirect:/list";
    }
    @RequestMapping("/toEdit")
    public String toEdit(Model model, long id){
        User user = userService.findUserById(id);
        model.addAttribute("user",user);
        return "user/userEdit";
    }
    @RequestMapping("/edit")
    public String edit(User user){
        userService.edit(user);
        return "redirect:/list";
    }
    @RequestMapping("/delete")
    public String delete(long id){
        userService.deleteById(id);
        return "redirect:/list";
    }
}
