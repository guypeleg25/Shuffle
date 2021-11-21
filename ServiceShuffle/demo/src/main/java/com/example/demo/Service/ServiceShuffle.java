package com.example.demo.Service;


import com.example.demo.Controller.Bo.ShuffleInput;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface ServiceShuffle {

    CompletableFuture<List<Integer>> shuffleList(ShuffleInput shuffleInput);
}
