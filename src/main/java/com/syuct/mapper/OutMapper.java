package com.syuct.mapper;

import com.syuct.pojo.vo.OrderVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

/**
 * @Author Zsz
 * @Date 2022/3/7 15:08
 * @Version 1.0
 **/
@Repository
public interface OutMapper {
    int getOutOrderCountByPage();

    List<OrderVo> getOutOderInfoByPage(@Param("page")int page, @Param("limit") int limit);

    int getOutOrderCountByParams(@Param("id")BigInteger id, @Param("origin")Integer origin);

    List<OrderVo> getOutOderInfoByParams(@Param("id")BigInteger id, @Param("origin")Integer origin, @Param("page")int page, @Param("limit") int limit);

    int getOrderStatusById(BigInteger id);

    void verifyOrderById(BigInteger id);

    int getSaleCountByPage();

    List<OrderVo> getSaleInfoByPage(@Param("page")int page, @Param("limit") int limit);

    int getSaleCountByParams(@Param("id")BigInteger id, @Param("origin")Integer origin);

    List<OrderVo> getSaleInfoByParams(@Param("id")BigInteger id, @Param("origin")Integer origin, @Param("page")int page, @Param("limit") int limit);

    void completeOrderById(BigInteger id);

    int getReturnOutOrderCountByPage();

    List<OrderVo> getReturnInOderInfoByPage(@Param("page")int page, @Param("limit") int limit);

    int getReturnOutOrderCountByParams(@Param("id")BigInteger id, @Param("origin")Integer origin);

    List<OrderVo> getReturnOutOderInfoByParams(@Param("id")BigInteger id, @Param("origin")Integer origin, @Param("page")int page, @Param("limit") int limit);

    void verifyReturnOutOrder(BigInteger id);
}
