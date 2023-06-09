package com.example.springboot.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

/**
 * 售卖实体类
 */
@Data
public class Sale {

    /**
     * id
     */
    private Integer id;
    /**
     * 图书名称
     */
    private String bookName;
    /**
     * 图书标准号
     */
    private String bookNo;

    /**
     * 用户id
     */
    private String userNo;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 用户联系方式
     */
    private String userPhone;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate createtime;

    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate updatetime;

    /**
     * 购书积分
     */
    private Integer score;

    /**
     * 售书日期
     */
    private LocalDate saleDate;
}