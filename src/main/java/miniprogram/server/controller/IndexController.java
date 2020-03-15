package miniprogram.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/index")
public class IndexController {

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "MiniProgram-server-JAVA";
    }

}
