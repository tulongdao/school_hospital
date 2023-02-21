package org.example.dao;

import org.apache.ibatis.annotations.Param;
import org.example.entity.Banner;
import org.example.entity.User;

import java.util.List;


public interface BannerDao {
    //增加轮播图片
   Boolean insertImg(@Param("url") String url, @Param("name") String name);
    //查询轮播图片
    List<Banner> selectAll();
    // 删除轮播图片
    Boolean deleteImgById(@Param("id")Integer id);
}
