package com.bw.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 赵德旺 on 2017/7/24.
 */
@RestController
public class DcController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/con")
    public String dc() {


        return restTemplate.getForObject("http://eureka-client/dc", String.class);

    }


}
