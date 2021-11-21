package com.example.demo.Service;

import com.example.demo.Controller.Bo.ServiceLogInput;
import org.springframework.stereotype.Service;

@Service
public class ServiceLogImpl implements ServiceLog{

    @Override
    public void print(ServiceLogInput input) {
        System.out.println(input);
    }
}