package vip.ph.mongo.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vip.ph.mongo.pojo.Banner;
import vip.ph.mongo.repository.BannerRepository;
import vip.ph.mongo.service.BannerService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Just be alive
 * @version 1.0
 * @date 2021-07-08 - 22:20
 */
@Service
@Transactional
public class BannerServiceImpl implements BannerService {

    @Resource
    BannerRepository bannerRepository;


    @Override
    public List<String> queryAll() {
        List<Banner> banner = bannerRepository.findAll();
        List<String> stringList = new ArrayList<>();
        for (Banner banner1 : banner) {
            stringList.add(banner1.getPath());
        }
        return stringList;
    }
}

