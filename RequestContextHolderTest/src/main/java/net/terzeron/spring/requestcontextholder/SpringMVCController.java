package net.terzeron.spring.requestcontextholder;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

/**
 * Created by terzeron on 2017. 10. 23..
 */
@Controller
public class SpringMVCController {
    @RequestMapping(value = "/springmvctest", method = RequestMethod.GET)
    public String redirectTest() {
        // setting value to HttpSession object
        // RequestContextHolder를 이용하면 세션의 속성 값을 지정할 수 있음
        RequestContextHolder.getRequestAttributes().setAttribute("KEY_VALUE", "TEST_VALUE", RequestAttributes.SCOPE_SESSION);
        return "hello";
    }
}
