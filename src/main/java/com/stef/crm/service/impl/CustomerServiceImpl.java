package com.stef.crm.service.impl;

import com.stef.crm.entity.Customer;
import com.stef.crm.mapper.CustomerMapper;
import com.stef.crm.service.CustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author stef
 * @since 2021-05-05
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {

}
