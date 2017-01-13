package com.github.slothLabs.slothBook;

import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author mcory
 */
@Controller
public class IndexController {
    
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public void welcome() {
        
    }
    
    @RequestMapping(value = "/form", method = RequestMethod.GET, produces = "application/vnd+formdef.json")
    @ResponseBody
    public String blah() {
        final FormDefinition res = new FormDefinition();
        res.setAction("/dostuff");
        res.setMethod(RequestMethod.POST);
        res.setType("aThing");
        
        final FormField f1 = new FormField();
        f1.setName("username");
        f1.setType("string");
        res.addField(f1);
        
        final FormField f2 = new FormField();
        f2.setName("pwd");
        f2.setType("password");
        res.addField(f2);
        final Gson gson = new Gson();
        return gson.toJson(res);
    }
    
    @RequestMapping(value = "/form", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String blah2() {
        return "{\"status\": \"OK\"}";
    }
}
