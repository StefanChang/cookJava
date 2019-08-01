package javas.proxy;

import javas.proxy.impl.OrderServiceImpl;
import lombok.extern.slf4j.Slf4j;

/**
 * 通过集成实现类来实现代理
 * @author changle
 * Created on 2019-08-01
 *
 * 优缺点：
 *      如果此时要叠加代理的功能，不仅记录预减日志，还进行权限拦截功能，
 *      如果以继承的方式，就得再新建一个代理类 实现日志和权限的逻辑。
 *      当需要调整顺序时，也需要对代理类进行修改，不是很灵活
 */
@Slf4j
public class OrderServiceLogProxy extends OrderServiceImpl {
    @Override
    public void reduceStock() {
        log.info("log before ");
        super.reduceStock();
        log.info("log after");
    }
}
