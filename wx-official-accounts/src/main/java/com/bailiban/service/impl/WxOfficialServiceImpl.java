package com.bailiban.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.bailiban.entity.Article;
import com.bailiban.repository.WxOfficialRepository;
import com.bailiban.service.WxOfficialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhulang
 * @Classname WxOfficialServiceImpl
 * @Description TODO
 * @Date 2020/5/3 18:25
 */
@Service
public class WxOfficialServiceImpl implements WxOfficialService {
    @Autowired
    private WxOfficialRepository wxOfficialRepository;
    @Override
    public void save(String datas) {
        System.out.println("-----------开始--------------");
        JSONArray objects = JSON.parseArray(datas);
        System.out.println("-----------转换list--------------");
        List<Article> articles = JSON.parseArray(objects.toString(), Article.class);
        wxOfficialRepository.saveAll(articles);
    }
}
