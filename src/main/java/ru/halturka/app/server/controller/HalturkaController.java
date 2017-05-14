package ru.halturka.app.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Dmitry on 14.05.2017.
 */
@Controller
@RequestMapping("/")
public class HalturkaController {
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getHalturka(ModelMap map){
        return "take out the trash";
    }
}
