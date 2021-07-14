package vip.ph.mongo.repository;

import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import vip.ph.mongo.pojo.Banner;

/**
 * @author Just be alive
 * @version 1.0
 * @date 2021-07-09 - 11:04
 */
public interface BannerRepository extends MongoRepository<Banner,String> {


//    Banner selectBannerByQuery(Query query);
}
