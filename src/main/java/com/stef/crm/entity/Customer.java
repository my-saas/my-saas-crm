package com.stef.crm.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 *
 * </p>
 *
 * @author stef
 * @since 2021-05-05
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("t_customer")
public class Customer extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 客户编号
     */
    private String customerId;

    /**
     * 客户姓名
     */
    private String name;

    /**
     * 客户所属地
     */
    private String area;

    /**
     * 客户经理
     */
    private String cusManager;

    /**
     * 客户级别
     */
    private String level;

    /**
     * 客户满意度
     */
    private String satisfaction;

    /**
     * 客户信誉
     */
    private String reputation;

    /**
     * 客户地址
     */
    private String address;

    /**
     * 邮编
     */
    private String postCode;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 传真
     */
    private String fax;

    /**
     * 网址
     */
    private String webSite;

    /**
     * 营业执照注册好
     */
    private String businessLicense;

    /**
     * 法人代表
     */
    private String legalPerson;

    /**
     * 注册资金
     */
    private String registeredCapital;

    /**
     * 年营业额
     */
    private String turnover;

    /**
     * 开户银行
     */
    private String bank;

    /**
     * 开户账号
     */
    private String accountNumber;

    /**
     * 地税登记号
     */
    private String localTaxNum;

    /**
     * 国税登记号
     */
    private String nationalTaxNum;

    /**
     * 流失状态
     */
    private Integer state;

    /**
     * 有效时间
     */
    private Integer isValid;



}
