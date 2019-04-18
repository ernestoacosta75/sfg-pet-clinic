package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    /**
     * Return an owners list.
     * @return Owners list
     */
    @RequestMapping({"","/", "/index", "/index.html"})
    public String listVets() {
        return "owners/index";
    }
}
