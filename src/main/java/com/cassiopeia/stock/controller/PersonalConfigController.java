package com.cassiopeia.stock.controller;

import com.cassiopeia.stock.beans.AnaCategory;
import com.cassiopeia.stock.beans.AnaCategoryExample;
import com.cassiopeia.stock.mapper.AnaCategoryMapper;
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
