package com.buer;

import com.buer.dao.CustomerMapper;
import com.buer.domain.Customer;
import com.buer.service.IcustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;


/**
 * @Description:
 * @Author: boolean
 * @Date: 2019/12/22 12:52
 */
public class Test {

    @org.junit.Test
    public void insertByMapper() throws IOException {
        // 1. 加载spring配置
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2. 获取对象
        CustomerMapper customerMapper = (CustomerMapper) ac.getBean("customerMapper");
        System.out.println(customerMapper);
        // 3. 调用方法
        Customer customer = new Customer();
        customer.setName("booleanbl-spring");
        customer.setGender("男");
        customer.setTelephone("020-3333333");
        customer.setAddress("广州天河城广场");
        customerMapper.saveCustomer(customer);
    }

    @org.junit.Test
    public void insertByService() throws IOException {
        // 1. 加载spring配置
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2. 获取对象
        IcustomerService customerService = (IcustomerService) ac.getBean("customerService");
        customerService.saveCustomer();
    }
}



