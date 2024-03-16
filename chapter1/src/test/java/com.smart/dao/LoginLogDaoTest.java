package com.smart.dao;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@ContextConfiguration(locations ={"/ApplicationContext.xml"})
public class LoginLogDaoTest extends AbstractTestNGSpringContextTests {
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
