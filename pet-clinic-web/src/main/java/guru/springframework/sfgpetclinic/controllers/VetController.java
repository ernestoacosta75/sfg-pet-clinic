package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vets")
@Controller
public class VetController {

    /**
     * Return a vets list.
     * @return Vets list
     */
    @RequestMapping({"","/", "/index", "/index.html"})
    public String listVets() {
        return "vets/index";
    }
}
