package org.example.controller;

import org.example.entity.Banner;
import org.example.service.intf.BannerService;
import org.example.service.intf.UserService;
import org.example.util.RUtil;
import org.example.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/home/")
@RestController
public class HomeController {
    @Autowired
    private BannerService bannerService;
    /*
     * 新增*/
    @RequestMapping("insertBanner.do")
    @ResponseBody
    public R insert(String url, String name){
        Boolean result = bannerService.insertImg(url, name);
        if (!result){
            RUtil.fail();
        }
        return RUtil.ok();
    }

    @RequestMapping("selectBanner.do")
    @ResponseBody
    public List<Banner> selectAll(){
        List<Banner> bannerList = bannerService.selectAll();
        return bannerList;
    }
    @RequestMapping("deleteBanner.do")
    @ResponseBody
    public R deleteImgById(Integer id){
        Boolean result = bannerService.deleteImgById(id);
        if (!result){
            RUtil.fail();
        }
        return RUtil.ok();
    }
}
