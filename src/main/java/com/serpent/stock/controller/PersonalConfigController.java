package com.serpent.stock.controller;

import com.serpent.stock.beans.AnaCategory;
import com.serpent.stock.beans.AnaCategoryExample;
import com.serpent.stock.mapper.AnaCategoryMapper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/queryConfig")
public class PersonalConfigController {

    final AnaCategoryMapper categoryMapper;

    public PersonalConfigController(AnaCategoryMapper categoryMapper1) {
        this.categoryMapper = categoryMapper1;
    }

    @RequestMapping("/categoryConfig")
    @CrossOrigin
    public List<AnaCategory> queryCategory() {
        AnaCategoryExample example = new AnaCategoryExample();
        AnaCategoryExample.Criteria criteria  = example.createCriteria();
        criteria.andPkCategoryIsNotNull();
        return this.categoryMapper.selectByExample(example);
    }

}
