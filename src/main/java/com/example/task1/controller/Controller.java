package com.example.task1.controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    public String val = "Sameer";

    @RequestMapping(method = RequestMethod.GET, path="/")
    public String welcome()
    {
        return "Welcome to localhost..." + val;
    }
    @RequestMapping(method = RequestMethod.GET, path="/{name}")
    public String display_name(@PathVariable String name)
    {
        return name;
    }
    @RequestMapping(method = RequestMethod.POST, path="/update")
    public void update_val(@RequestBody String new_val)
    {
        val = new_val;
    }
}
