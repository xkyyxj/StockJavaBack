package com.serpent.stock.controller;

import com.cassiopeia.rust.RustAPI;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class CalculateController {

    @RequestMapping("/calculateHistoryDownSync")
    public boolean calculateHistoryDown() {
        RustAPI.calculateHistoryDownSync();
        return true;
    }

}
