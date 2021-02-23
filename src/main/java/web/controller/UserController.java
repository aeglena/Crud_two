package web.controller;

//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Controller
//public class UserController {
//
//    @GetMapping()
//    public String printWelcome(ModelMap model) {
//        List<String> messages = new ArrayList<>();
//        messages.add("Hello!");
//        messages.add("I'm Spring MVC application");
//        messages.add("5.2.0 version by sep'19 ");
//        model.addAttribute("messages", messages);
//        return "read";
//    }
//
//}

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
//import web.config.PersistenceJPAConfig;
import web.dao.UserDao;
import web.model.User;
import web.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Controller
//@RequestMapping()
public class UserController {
    //private UserService userServiceBean;// = applicationContext.getBean(UserService.class);

    //@Autowired
//@Qualifier(value = "UserService")
//    pu
    private UserDao userDao;
    @GetMapping("/")
    public String readAll(Model model) {
        //model.addAttribute("users", userServiceBean.readAll());
        return "read";
    }

    ////    @GetMapping("/readUser/{id}")
////    public String readUser(@PathVariable("id") Long id, Model model){
////            model.addAttribute("user", userServiceBean.read(id));
////            return "readUser";
////        }
//

}
////
////    @GetMapping("/new")
////    public String newUser(Model model){
////        model.addAttribute("user", new User());
////        return "newUser";
////    }
////    @PostMapping
////    public String saveUser(@ModelAttribute ("user") User user) {
////        userServiceBean.save(user);
////        return "redirect:/readAll";
////    }
////
////    @DeleteMapping("/delete")
////    public String deleteUser(@PathVariable("id") Long id){
////        userServiceBean.delete(id);
////        return "redirect:/readAll";
////    }
////
////    @GetMapping("{id}/updateUser")
////    public String update(Model model, @PathVariable("id") Long id){
////        model.addAttribute("user", userServiceBean.read(id));
////        return "update";
////    }
////
////    @PatchMapping("/{id}")
////    public String updateUser(@ModelAttribute ("user") User user, @PathVariable( "id") Long id){
////        userServiceBean.update(user, id);
////        return "redirect:/readAll";
////    }
//}
