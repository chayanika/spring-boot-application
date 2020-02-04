package com.luv2code.springdemo.mvc;

/**
 * @author Chayanika Ghosh
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeWorldController {
    @RequestMapping("/spring-mvc-demo")
        public String springmvcdemo(){
        return "main-menu";
    }
    @RequestMapping("/showForm")
    public String showPage() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model){

        String theName = request.getParameter("studentName");
        theName= theName.toUpperCase();
        String result = "Yo!  "+ theName;

        model.addAttribute("message", result);
        return "helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam ("studentName") String theName, Model model){

        theName = theName.toUpperCase();
        String result = "Hey Friend! " +theName;
        model.addAttribute("message", result);

        return "helloworld";
    }
}
