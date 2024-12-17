package com.syuct.mapper;

import com.syuct.pojo.StoreOutIn;
import com.syuct.pojo.vo.DepotInventoryVo;
import com.syuct.pojo.vo.StoreOutInVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

/**
 * @Author Zsz
 * @Date 2022/3/9 11:49
 * @Version 1.0
 **/
@Repository
public interface DepotMapper {
    int getDepotInventoryCount();

    List<DepotInventoryVo> getDepotInventoryByPage(@Param("page")int page, @Param("limit") int limit);

    int getDepotInventoryCountByparams(@Param("goodsName")String goodsName, @Param("storeName")String storeName);

    List<DepotInventoryVo> getDepotInventoryByParams(@Param("goodsName")String goodsName, @Param("storeName")String storeName, @Param("page")int page,@Param("limit") int limit);

    int getStoreOutInInfoCount();

    List<StoreOutInVo> getStoreOutInInfoByPage(@Param("page")int page,@Param("limit") int limit);

    int getStoreOutInInfoCountByParams(@Param("storeId")Integer storeId, @Param("goodsId")Integer goodsId);

    List<StoreOutInVo> getStoreOutInInfoByParams(@Param("storeId")Integer storeId, @Param("goodsId")Integer goodsId,@Param("page")int page, @Param("limit") int limit);

    void addStoreOutIn(StoreOutIn storeOutIn);

    void delOutIn(int id);

    int getStoreOutInStatusById(int id);

    StoreOutIn getStoreOutInInfoById(int id);

    void verifyOutIn(int id);
}
