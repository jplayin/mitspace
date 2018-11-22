package com.mit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 
 */
@Controller
public class DemoController {

   @GetMapping("/any")
   public String abbc(Model model) {

      return "template";
   }
   
   @GetMapping("/admin")
   public String adm(Model model) {

      return "template";
   }

}
