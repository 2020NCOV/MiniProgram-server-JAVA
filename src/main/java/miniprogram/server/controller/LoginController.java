package miniprogram.server.controller;

import miniprogram.server.service.AllService;
import miniprogram.server.utils.JSONRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/index/login")
public class LoginController {

    @Autowired
    private AllService allService;

    @PostMapping("/getcode")
    public JSONRes UserLogin(@RequestParam("code") String code) throws IOException {
        JSONRes result = allService.getCode(code);
        return result;
    }
}
