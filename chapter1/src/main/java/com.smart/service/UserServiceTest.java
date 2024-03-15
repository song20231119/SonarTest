package com.smart.service;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import com.smart.domain.User;

@ContextConfiguration(locations={"/ApplicationContext.xml"})

public class UserServiceTest extends AbstractTestNGSpringContextTests{
    @Autowired
    private UserService userService;
    @Test
    public void hasMatchUser(){
        boolean b1 = userService.hasMatchUser("admin","123456");
        boolean b2 = userService.hasMatchUser("admin","1111");
        assertTrue(b1);
        assertTrue(!b2);
    }

    @Test
    public void findUserByUserName(){
        User user = userService.findUserByUserName("admin");
        assertEquals(user.getUserName(), "admin");
    }
}
