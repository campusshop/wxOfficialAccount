package com.bailiban.repository;

import com.bailiban.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zhulang
 * @Classname WxOfficialRepository
 * @Description TODO
 * @Date 2020/5/3 18:22
 */
public interface WxOfficialRepository extends JpaRepository<Article,Integer> {
}
