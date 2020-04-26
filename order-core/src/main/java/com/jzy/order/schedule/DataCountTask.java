package com.jzy.order.schedule;

import com.jzy.order.repository.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author jinziyu
 * @date 2020/4/25 2:17
 */
@Component
public class DataCountTask {
    @Autowired
    private OrderDao orderDao;

}
