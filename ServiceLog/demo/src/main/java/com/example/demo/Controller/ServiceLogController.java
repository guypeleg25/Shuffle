package com.example.demo.Controller;
import com.example.demo.Controller.Bo.ServiceLogInput;
import com.example.demo.Service.ServiceLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ServiceLogController {

    @Autowired
    ServiceLog serviceLog;

    @RequestMapping(method = RequestMethod.POST, value = "/print")
    public void printObject(@RequestBody ServiceLogInput input){
        serviceLog.print(input);
    }
}
