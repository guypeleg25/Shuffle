package com.example.demo.Controller.Bo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShuffleOutput {

    @JsonProperty("integerList")
    List<Integer> integerList;
}
