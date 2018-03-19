package net.terzeron.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/springmvc4")
public class SpringMVC4Helloworld {
    // http://localhost:8080/springmvc4/hello
    @RequestMapping(value="/hello", method=RequestMethod.GET)
    public String hello(ModelMap model) {
        model.addAttribute("msg", "hello world");
        return "helloworld";
    }

    // http://localhost:8080/springmvc4/greetings/ted
    @RequestMapping(value="/greetings/{msg}", method=RequestMethod.GET)
    public String greetingsMsg(@PathVariable String msg, ModelMap model) {
        model.addAttribute("msg", msg);
        return "helloworld";
    }
}
