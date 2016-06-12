package ru.orbot90.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by orbot on 12.06.16.
 */
@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getData() {
        List<String> list = getList();

        ModelAndView model = new ModelAndView("index");
        model.addObject("lists", list);

        return model;
    }

    private List<String> getList() {
        List<String> list = new ArrayList<>();
        list.add("ListA");
        list.add("ListB");
        list.add("ListC");
        list.add("ListD");
        list.add("List1");
        list.add("List2");
        list.add("List3");

        return list;
    }
}
