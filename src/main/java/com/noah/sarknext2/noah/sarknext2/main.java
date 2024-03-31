package com.noah.sarknext2.noah.sarknext2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class main {

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/ourServices")
    public String ourServices(){
        return "ourServices";
    }

    @GetMapping("/team")
    public String teamPage(){
        return "team";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }

    @GetMapping("/cognition")
    public String cognitionPage(){
        return "cognition";
    }

    @GetMapping("/personality")
    public String personality(){
        return "personality";
    }

    @GetMapping("/community")
    public String communityPage(){
        return "community";
    }
}
