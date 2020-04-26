package com.jzy.order;

import com.jzy.order.bootstrap.OrderApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest(classes = OrderApplication.class)
class OrderApplicationTests {

    @Test
    void contextLoads() {
        log.info("info");
        log.error("error");
    }

}
