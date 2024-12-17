package com.syuct.mapper;

import com.syuct.pojo.vo.AccountReportVo;
import com.syuct.pojo.vo.PurchaseReportVo;
import com.syuct.pojo.vo.StoreLogVo;
import com.syuct.pojo.vo.WarningVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * @Author Zsz
 * @Date 2022/3/11 10:05
 * @Version 1.0
 **/
@Repository
public interface ReportMapper {
    int getAccountReportCounts();

    List<AccountReportVo> getAccountReportByPage(@Param("page")int page, @Param("limit") int limit);

    int getAccountReportCountsByParams(@Param("name")String name,@Param("type") String type);

    List<AccountReportVo> getAccountReportByParams(@Param("name")String name,@Param("type") String type, @Param("page")int page, @Param("limit") int limit);

    List<PurchaseReportVo> getPurchaseReportBypage(@Param("page")int page, @Param("limit") int limit);

    List<PurchaseReportVo> getPurchaseReportByParams(@Param("goodsIdByName")Integer goodsIdByName, @Param("startDate")Date startDate, @Param("endDate")Date endDate, @Param("page")int page, @Param("limit") int limit);

    List<PurchaseReportVo> getSaleReportBypage(@Param("page")int page, @Param("limit") int limit);

    List<PurchaseReportVo> getSaleReportByParams(@Param("goodsIdByName")Integer goodsIdByName, @Param("startDate")Date startDate, @Param("endDate")Date endDate, @Param("page")int page, @Param("limit") int limit);

    int getInStoreLogCount();

    List<StoreLogVo> getInStoreLogByPage(@Param("page")int page, @Param("limit") int limit);

    int getInStoreLogCountByParams(@Param("goodsId")Integer goodsId,@Param("storeId") Integer storeId, @Param("startDate")Date startDate, @Param("endDate")Date endDate);

    List<StoreLogVo> getInStoreLogByParams(@Param("goodsId")Integer goodsId,@Param("storeId") Integer storeId, @Param("startDate")Date startDate, @Param("endDate")Date endDate, @Param("page")int page, @Param("limit") int limit);

    int getOutStoreLogCount();

    List<StoreLogVo> getOutStoreLogByPage(@Param("page")int page, @Param("limit") int limit);

    int getOutStoreLogCountByParams(@Param("goodsId")Integer goodsId,@Param("storeId") Integer storeId, @Param("startDate")Date startDate, @Param("endDate")Date endDate);

    List<StoreLogVo> getOutStoreLogByParams(@Param("goodsId")Integer goodsId,@Param("storeId") Integer storeId, @Param("startDate")Date startDate, @Param("endDate")Date endDate, @Param("page")int page, @Param("limit") int limit);

    int getBackStoreLogCount();

    List<StoreLogVo> getBackStoreLogByPage(@Param("page")int page, @Param("limit") int limit);

    int getBackStoreLogCountByParams(@Param("type")int type, @Param("goodsId")Integer goodsId, @Param("startDate")Date startDate, @Param("endDate")Date endDate);

    List<StoreLogVo> getBackStoreLogByParams(@Param("type")int type, @Param("goodsId")Integer goodsId, @Param("startDate")Date startDate, @Param("endDate")Date endDate, @Param("page")int page, @Param("limit") int limit);

    int getWarningGoodsCount();

    List<WarningVo> getWarningGoodsInfoByPage(@Param("page")int page, @Param("limit") int limit);

    int getWarningGoodsCountByParams(@Param("goodsId")Integer goodsId, @Param("storeId")Integer storeId);


    List<WarningVo> getWarningGoodsInfoByParams(@Param("goodsId")Integer goodsId, @Param("storeId")Integer storeId, @Param("page")int page, @Param("limit") int limit);
}
