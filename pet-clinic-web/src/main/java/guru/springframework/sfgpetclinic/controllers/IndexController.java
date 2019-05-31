package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    /**
     * Returns the index page.
     * @return Index page.
     */
    @RequestMapping({"", "/", "index", "index.html"})
    public String index() {

        return "index";
    }

    /**
     * Returns the notimplemented page.
     * @return notimplemented page.
     */
    @RequestMapping({"/oups"})
    public String oupsHandler() {
        return "notimplemented";
    }
}
