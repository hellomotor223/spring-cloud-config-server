package com.h2h.springcloudconfigserver;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URLEncoder;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringCloudConfigServerApplicationTests {

    @Test
    public void contextLoads() {
        try {
            System.out.println(URLEncoder.encode("http://p7fgcvfrs.bkt.clouddn.com/4024889732039680?e=1534762676&token=T93r9zWx4a97k0PkXTECe0-4yNhnsylM8eqV-QS2:onn2BD_ez3lubbECy_bdnGkEsCY=&attname=a.doc", "iso-8859-1"));
        }catch (Exception e) {

        }

    }

}
