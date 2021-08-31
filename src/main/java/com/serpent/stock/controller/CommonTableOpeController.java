package com.serpent.stock.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonTableOpeController {

    @RequestMapping("/table/query")
    public Object commonTableQuery(String tableName, String wherePart) {
        return null;
    }

    @RequestMapping("/table/update")
    public void commonTableUpdate() {

    }

    @RequestMapping("/table/insert")
    public void commonTableInsert() {

    }

}
