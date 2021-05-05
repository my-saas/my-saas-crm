package com.stef.crm.controller;

import com.stef.crm.entity.Customer;
import com.stef.crm.service.CustomerService;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stef.crm.common.RespBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;


/**
 *
 *
 * @author stef
 * @date 2021-05-05
 */
@RestController
@RequestMapping("/customer")
@Api(value = "/customer", tags = "管理")
public class CustomerController {

    @Autowired
    private  CustomerService customerService;

    /**
     * 分页查询
     * @param page 分页对象
     * @param customer
     * @return RespBean
     */
    @ApiOperation(value = "分页查询", notes = "分页查询")
    @GetMapping("/page" )
    public RespBean getCustomerControllerPage(Page page, Customer customer) {
        return RespBean.ok(customerService.page(page, Wrappers.query(customer)));
    }


    /**
     * 通过id查询
     * @param id id
     * @return RespBean
     */
    @ApiOperation(value = "通过id查询", notes = "通过id查询")
    @GetMapping("/{id}" )
    public RespBean getById(@PathVariable("id" ) Long id) {
        return RespBean.ok(customerService.getById(id));
    }

    /**
     * 新增
     * @param customer
     * @return RespBean
     */
    @ApiOperation(value = "新增", notes = "新增")
    @PostMapping
    public RespBean save(@RequestBody Customer  customer) {
        return RespBean.ok(customerService.save(customer));
    }

    /**
     * 修改
     * @param customer
     * @return RespBean
     */
    @ApiOperation(value = "修改", notes = "修改")
    @PutMapping
    public RespBean updateById(@RequestBody Customer  customer) {
        return RespBean.ok(customerService.updateById(customer));
    }

    /**
     * 通过id删除
     * @param id id
     * @return RespBean
     */
    @ApiOperation(value = "通过id删除", notes = "通过id删除")
    @DeleteMapping("/{id}" )
    public RespBean removeById(@PathVariable Long id) {
        return RespBean.ok(customerService.removeById(id));
    }

}
