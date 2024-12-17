package com.syuct.mapper;

import com.syuct.pojo.Category;
import com.syuct.pojo.Goods;
import com.syuct.pojo.Measure;
import com.syuct.pojo.vo.GoodsVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Zsz
 * @Date 2022/1/10 18:19
 * @Version 1.0
 **/

@Repository
public interface CommodityMapper {

    int getCategoryCounts();

    List<Category> getCategoryInfo();

    List<Category> getCategoryInfoByPage(@Param("page")int page, @Param("limit")int limit);

    List<Category> getCategoryInfoByparams(@Param("name")String name, @Param("page")int page,@Param("limit") int limit);

    int getCategoryCountsByName(String name);

    int addCategory(Category category);

    int delCategory(int id);

    Category getCategoryInfoById(int id);

    void delCategoryByPid(int id);

    int getCategoryCountsByPid(int id);

    List<Category> getCategoryInfoByPid(int pid);

    int getMeasureCountByPage();

    List<Measure> getMeasureInfoByPage(@Param("page")int page,@Param("limit") int limit);

    int delMeasureById(int id);

    int addMeasure(Measure measure);

    Measure getMeasureCountById(int id);

    int editMeasure(Measure measure);

    int getGoodsCountBypage();

    List<GoodsVo> getGoodsInfoByPage(@Param("page")int page,@Param("limit") int limit);

    List<String> getSupplierInfoByGoodId(int id);

    int getGoodsCountByParams(@Param("id")int id, @Param("name")String name, @Param("supplier")String supplier);

    List<GoodsVo> getGoodsInfoByParams(@Param("id")int id, @Param("name")String name, @Param("supplier")String supplier, @Param("page")int page,@Param("limit") int limit);

    int addGoods(Goods goods);

    void addGoodsSupplier(@Param("goodsId")int goodsId, @Param("goodsSupplier")int goodsSupplier);

    Goods getGoodsInfoById(int id);

    List<Integer> getSupploerIdListByGid(int id);

    int updGoodsInfoById(GoodsVo goodsVo);

    void delGoodsSupplierByGid(int id);

    int upGoodsStatusById(int id);

    int downGoodsStatusById(int id);

    void delGoodsById(int id);

    List<GoodsVo> getGoodsInfoByName(@Param("goodsIdByName")Integer goodsIdByName, @Param("page")int page,@Param("limit") int limit);
}
