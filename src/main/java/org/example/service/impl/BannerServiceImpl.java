package org.example.service.impl;


import org.example.dao.BannerDao;
import org.example.dao.UserDao;
import org.example.entity.Banner;
import org.example.entity.User;
import org.example.service.intf.BannerService;
import org.example.service.intf.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Base64;
import java.util.List;


@Service
public class BannerServiceImpl implements BannerService {
  @Resource
    private BannerDao bannerDao;
    @Override
    public Boolean insertImg(String url, String name) {
        Boolean result = bannerDao.insertImg(url, name);
        return result;
    }

    @Override
    public List<Banner> selectAll() {
        List<Banner> bannerList = bannerDao.selectAll();
        return bannerList;
    }

    @Override
    public Boolean deleteImgById(Integer id) {
        Boolean result = bannerDao.deleteImgById(id);
        return result;
    }
}