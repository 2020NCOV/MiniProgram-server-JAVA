package miniprogram.server.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.AbstractList;
import java.util.List;

@RestController
@RequestMapping("/index/district")
public class DistrictController {

    @GetMapping(value = "getall")
    public JSONObject getAll() {
        System.out.println("method----------------------getAll");
        JSONObject data = new JSONObject();
        JSONObject districtdata = new JSONObject();
        List<JSONObject> level_data = new AbstractList<JSONObject>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public JSONObject get(int index) {
                return null;
            }
        };

        List<JSONObject> tree_data = new AbstractList<JSONObject>() {
            @Override
            public JSONObject get(int index) {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }
        };

        districtdata.put("level_data",level_data);
        districtdata.put("tree_data",tree_data);

        data.put("code", 0);
        data.put("data", districtdata);
        data.put("message", "");
        return data;
    }
}
