package com.syuct.mapper;

import com.syuct.pojo.*;
import com.syuct.pojo.vo.OrderLIstVo;
import com.syuct.pojo.vo.OrderVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

/**
 * @Author Zsz
 * @Date 2022/2/23 11:45
 * @Version 1.0
 **/
@Repository
public interface PurchaseMapper {
    int getInOrderCountByPage();

    List<OrderVo> getInOderInfoByPage(@Param("page")int page, @Param("limit") int limit);

    int getOrderListInfoCount(BigInteger listId);

    List<OrderLIstVo> getOrderListInfoById(BigInteger listId);

    BigInteger getOrderListIdByOrderId(BigInteger id);

    int getOrderStatusById(BigInteger id);

    void verifyOrderById(BigInteger id);

    int addOrder(Order order);

    void addOrderList(@Param("orderId")BigInteger orderId, @Param("goodsId")int goodsId);

    OrderLIstVo getOrderListIdById(int id);

    int editOrderListItem(OrderList orderList);

    void delOrderById(BigInteger id);

    void delOrderListByOrderId(BigInteger list);

    int getInOrderCountByParams(@Param("id")BigInteger id,@Param("origin") Integer origin);

    List<OrderVo> getInOderInfoByParams(@Param("id")BigInteger id,@Param("origin") Integer origin, @Param("page")int page, @Param("limit") int limit);

    int getEnterCountByPage();

    List<OrderVo> getEnterInfoByPage(@Param("page")int page, @Param("limit") int limit);

    int getEnterCountByParams(@Param("id")BigInteger id,@Param("origin") Integer origin);

    List<OrderVo> getEnterInfoByParams(@Param("id")BigInteger id,@Param("origin") Integer origin, @Param("page")int page, @Param("limit") int limit);

    OrderVo getOrderInfoById(BigInteger id);

    Order getOrderById(BigInteger id);

    List<OrderList> getOrderListById(BigInteger list);

    void addOrderLog(OrderLog orderLog);

    StoreInventory getStoreInventoryByGSId(@Param("goodsId")int goodsId, @Param("storeId")int storeId);

    void addStoreInventory(StoreInventory storeInventory);

    void updStoreInventory(@Param("goodsId")int goodsId, @Param("storeId")int storeId, @Param("inventory")int inventory);

    void addStoreLog(StoreLog storeLog);

    void completeOrderById(BigInteger id);

    int getReturnInOrderCountByPage();

    List<OrderVo> getReturnInOderInfoByPage(@Param("page")int page, @Param("limit") int limit);

    int getReturnInOrderCountByParams(@Param("id")BigInteger id,@Param("origin") Integer origin);

    List<OrderVo> getReturnInOderInfoByParams(@Param("id")BigInteger id,@Param("origin") Integer origin, @Param("page")int page, @Param("limit") int limit);

    int getOrderListGoodsIdById(int id);

    void verifyReturnInOrder(BigInteger id);
}
