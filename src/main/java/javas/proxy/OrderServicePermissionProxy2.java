package javas.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author changle
 * Created on 2019-08-01
 */
@Slf4j
public class OrderServicePermissionProxy2 extends OrderServiceLogProxy {
    @Override
    public void reduceStock() {
        log.info("permission before");
        super.reduceStock();
        log.info("permission after");
    }
}
