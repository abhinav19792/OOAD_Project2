package com.OOAD.order;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OnlineOrder {
	
	@RequestMapping(value = "/onlineOrder", method = RequestMethod.GET)
    public String onlineOrder(ModelMap model) {
        return "onlineOrder";
    }

}