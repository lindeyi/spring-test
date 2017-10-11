package com.bjnja.client;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
@SpringBootTest(classes = App.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public abstract class AppTest  extends TestCase{
}
