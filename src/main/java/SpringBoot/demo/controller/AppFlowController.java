package SpringBoot.demo.controller;

import SpringBoot.demo.service.AppFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppFlowController {
    @Autowired
    AppFlowService service;
    @GetMapping("/app_flow")
    public String appFLow(){
        return service.appFlow();
    }
}
