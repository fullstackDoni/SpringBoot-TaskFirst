package kz.springboot.springtaskfirst.controller;

import kz.springboot.springtaskfirst.db.DBManager;
import kz.springboot.springtaskfirst.db.Items;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String index(Model model){
        ArrayList<Items> item = DBManager.getItems();
        model.addAttribute("item",item);
        return "index";
    }
    @PostMapping(value = "add-item")
    public String addItem(Items items){
        DBManager.AddItem(items);
        return "redirect:/";
    }
    @GetMapping(value = "/add-item")
    public String additem(){
        return "add-item";
    }
    @GetMapping(value = "/item-details")
    public String getItem(@RequestParam(name = "id") int id,Model model){
        Items items = DBManager.getItem(id);
        model.addAttribute("item",items);
        return "details";
    }
}
