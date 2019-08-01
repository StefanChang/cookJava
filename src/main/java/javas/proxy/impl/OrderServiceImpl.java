package javas.proxy.impl;

import javas.proxy.base.OrderService;
import lombok.extern.slf4j.Slf4j;

/**
 * @author changle
 * Created on 2019-08-01
 */

/**
 *  业务实现类
 */

@Slf4j
public class OrderServiceImpl implements OrderService {
    public void reduceStock() {
        log.info("预减库存中。。。");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
