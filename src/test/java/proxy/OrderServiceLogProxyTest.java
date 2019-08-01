package proxy;

import org.junit.jupiter.api.Test;

import javas.proxy.OrderServiceLogProxy;
import javas.proxy.OrderServiceLogProxy2;
import javas.proxy.OrderServicePermissionProxy;
import javas.proxy.OrderServicePermissionProxy2;
import javas.proxy.impl.OrderServiceImpl;

/**
 * @author changle
 * Created on 2019-08-01
 */
public class OrderServiceLogProxyTest {

    @Test
    public void testOrderServiceProxy() {
        OrderServiceLogProxy proxy = new OrderServiceLogProxy();
        proxy.reduceStock();
    }

    @Test
    public void orderServiceProxy2() {
        OrderServiceImpl orderService = new OrderServiceImpl();
        OrderServiceLogProxy2 proxy = new OrderServiceLogProxy2(orderService);
        proxy.reduceStock();
    }

    @Test
    public void orderServiceProxyPermission() {
        OrderServiceImpl orderService = new OrderServiceImpl();
        OrderServiceLogProxy2 proxy2 = new OrderServiceLogProxy2(orderService);
        OrderServicePermissionProxy permissionProxy = new OrderServicePermissionProxy(proxy2);
        permissionProxy.reduceStock();
    }

    @Test
    public void orderServiceProxyPermission2() {
        OrderServicePermissionProxy2 permissionProxy = new OrderServicePermissionProxy2();
        permissionProxy.reduceStock();
    }
}
