package com.example.demo.Controller;

import com.example.demo.Controller.Bo.ShuffleInput;
import com.example.demo.Service.ServiceShuffle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
public class ServiceShuffleController {

    @Autowired
    ServiceShuffle serviceShuffle;

    @Async("asyncExecutor")
    @RequestMapping(method = RequestMethod.POST, value = "/shuffle")
    public CompletableFuture<List<Integer>> shuffle(@RequestBody ShuffleInput shuffleInput ){
        return serviceShuffle.shuffleList(shuffleInput);
    }
}