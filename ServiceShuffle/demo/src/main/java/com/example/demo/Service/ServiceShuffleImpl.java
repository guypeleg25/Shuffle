package com.example.demo.Service;

import com.example.demo.Controller.Bo.ShuffleInput;
import com.example.demo.Controller.Bo.ShuffleOutput;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class ServiceShuffleImpl implements ServiceShuffle{

    @Value("${serviceLog.url}")
    String serviceLogUrl;
    @Override
    @Async("asyncExecutor")
    public CompletableFuture<List<Integer>> shuffleList(ShuffleInput shuffleInput) {
        RestTemplate restTemplate = new RestTemplate();
        List<Integer> integerList = new ArrayList<>();
        if(shuffleInput.getNumber().equals(0)) return null;
        for(int i = 1 ; i <= shuffleInput.getNumber() ; i++){
            integerList.add(i);
        }
        Collections.shuffle(integerList);
        restTemplate.postForObject(serviceLogUrl
                ,new ShuffleOutput(integerList),void.class);
        return CompletableFuture.completedFuture(integerList);
    }
}

