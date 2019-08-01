package javas.proxy;

import javas.proxy.base.OrderService;
import javas.proxy.impl.OrderServiceImpl;
import lombok.extern.slf4j.Slf4j;

/**
 * 聚合方式实现代理
 * @author changle
 * Created on 2019-08-01
 */

@Slf4j
public class OrderServiceLogProxy2 implements OrderService {

    private OrderServiceImpl orderService;

    public OrderServiceLogProxy2(OrderServiceImpl orderService) {
        this.orderService = orderService;
    }

    public void reduceStock() {
        log.info("log begin");
        orderService.reduceStock();
        log.info("log after");
    }
}
