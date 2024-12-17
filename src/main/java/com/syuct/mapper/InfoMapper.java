package com.syuct.mapper;

import com.syuct.pojo.Account;
import com.syuct.pojo.Member;
import com.syuct.pojo.Store;
import com.syuct.pojo.Supplier;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author Zsz
 * @Date 2021/11/22 21:09
 * @Version 1.0
 **/
@Repository
public interface InfoMapper {

    List<Supplier> getSupplierInfoByPage(@Param("page")int page, @Param("limit") int limit);


    int getSupplierCounts();

    List<Supplier> getSupplierInfoByParams(@Param("id")int id, @Param("name")String name, @Param("page")int page, @Param("limit") int limit);

    int getSupplierCountsByParams(@Param("id")int id, @Param("name")String name, @Param("page")int page, @Param("limit") int limit);

    void delSupplierByid(int id);

    List<Account> getAccountInfoByPage(@Param("page")int page, @Param("limit") int limit);


    int getAccountCounts();

    List<Account> getAccountInfoByParams(@Param("id")int id,@Param("name") String name, @Param("flag")String flag, @Param("page")int page, @Param("limit") int limit);


    int getAccountCountsByParams(@Param("id")int id, @Param("name")String name);

    void delAccountById(int id);

    Account getgetAccountInfoById(int id);

    int addAccount(Account account);

    int updAccountInfo(Account account);

    List<Account> getAccountInfoByPageParam(@Param("name")String name, @Param("page")int page, @Param("limit") int limit);

    int addSupplier(Supplier supplier);

    Supplier getSupplierInfoById(int id);

    int updSupplierInfo(Supplier supplier);

    int getMemberCounts();

    List<Member> getMemberInfoByPage(@Param("page")int page, @Param("limit") int limit);

    int getMemberCountsByParams(@Param("id")int id, @Param("name")String name,@Param("phone") String phone);

    List<Member> getMemberInfoByParas(@Param("id")int id, @Param("name")String name, @Param("phone")String phone, @Param("page")int page, @Param("limit") int limit);

    int addMumber(Member membe);

    Member getMemberInfoById(int id);

    int editMember(Member member);

    int delMemberById(int id);

    int getStoreCounts();

    List<Store> getStoreInfoByPage(@Param("page")int page, @Param("limit") int limit);

    int getStoreCountsByParams(@Param("id")int id, @Param("name")String name,@Param("address") String address);

    List<Store> getStoreInfoByParams(@Param("id")int id, @Param("name")String name,@Param("address") String address, @Param("page")int page, @Param("limit") int limit);

    Store getStoreInfoById(int id);

    int delStoreById(int id);

    int addStore(Store store);

    int editStore(Store store);

    List<Account> getSupplierAccountInfoByPage(@Param("page")int page, @Param("limit") int limit);

    int getSupplierAccountCounts();

    int getSupplierAccountCountsByParams(String searchParams);

    List<Account> getSupplierAccountInfoByPageParam(@Param("searchParams") String searchParams, @Param("page")int page, @Param("limit") int limit);

    Store getStoreInfoByName(String name);

    Integer getSupplierIdByName(String name);

    int getSystemAccountCounts();

    List<Account> getSystemAccountInfoByPage(@Param("page")int page, @Param("limit") int limit);

    int getSystemAccountCountsByParams(String searchParams);

    List<Account> getSystemAccountInfoByParams(@Param("searchParams")String searchParams, @Param("page")int page, @Param("limit") int limit);

    void updAccountNowMoneyById(@Param("id")int id,@Param("money") BigDecimal money);

    Integer getMemberIdByName(String name);

    Integer getGoodsIdByName(String goodsName);

    Integer getStoreIdByName(String storeName);
}
