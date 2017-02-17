package com.javaquarium.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by quentin on 16/02/2017.
 */
@Controller
public class LoginAction {
        @RequestMapping("/login")
        public String login(Model model) {
            return "UC00_login";
        }
}
