package godziszewski.patryk.VirtualDeansOffice.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Patryk on 2016-12-18.
 */
@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping
    public String welcome() {
        return "home";
    }
}
