package org.example.service.intf;

import org.apache.ibatis.annotations.Param;
import org.example.entity.Banner;

import java.util.List;

public interface BannerService {
    //增加轮播图片
    Boolean insertImg(String url, String name);
    //查询轮播图片
    List<Banner> selectAll();
    // 删除轮播图片
    Boolean deleteImgById(Integer id);
}
