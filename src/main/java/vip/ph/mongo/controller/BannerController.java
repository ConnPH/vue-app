package vip.ph.mongo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vip.ph.mongo.service.BannerService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Just be alive
 * @version 1.0
 * @date 2021-07-08 - 22:19
 */
@RestController
@RequestMapping("banner")
public class BannerController {

    @Resource
    private BannerService bannerService;


    @GetMapping("all")
    public List<String> all(){
        return bannerService.queryAll();
    }


}
