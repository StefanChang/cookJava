package javas.proxy;

import javas.proxy.base.OrderService;
import lombok.extern.slf4j.Slf4j;

/**
 * 聚合方式实现（实现接口）
 * @author changle
 * Created on 2019-08-01
 */

@Slf4j
public class OrderServicePermissionProxy implements OrderService {

    private OrderService orderService;

    public OrderServicePermissionProxy(OrderService orderService) {
        this.orderService = orderService;
    }

    public void reduceStock() {
        log.info("permission before");
        orderService.reduceStock();
        log.info("permission after");
    }
}
