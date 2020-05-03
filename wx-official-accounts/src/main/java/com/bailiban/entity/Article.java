package com.bailiban.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author zhulang
 * @Classname Article
 * @Description TODO
 * @Date 2020/5/3 18:01
 */
@Data
@Entity
@Table(name = "tab_article")
public class Article {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "article_id")
    private Integer id;
    /**
     * 发表日期
     */
    private Date publish_date;
    /**
     * 标题
     */
    private String title;
    /**
     * 阅读人数
     */
    private Integer int_page_read_user;
    /**
     * 分享人数
     */
    private Integer share_user;
    private String name;


}
