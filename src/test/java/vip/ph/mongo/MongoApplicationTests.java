package vip.ph.mongo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import vip.ph.mongo.pojo.Banner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@SpringBootTest
class MongoApplicationTests {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    void contextLoads() {
        long start = System.currentTimeMillis();
        List<Banner> list = new ArrayList<>();
        Banner banner = new Banner();
        banner.setPath(UUID.randomUUID().toString().substring(0,10)+".png");
        banner.setCreateTime(new Date());
        list.add(banner);
        mongoTemplate.insert(list,Banner.class);
        System.out.println(System.currentTimeMillis()-start);
    }

}
