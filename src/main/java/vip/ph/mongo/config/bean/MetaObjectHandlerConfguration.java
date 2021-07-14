package vip.ph.mongo.config.bean;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

/**
 * @author Just be alive
 * @version 1.0
 * @date 2021-07-13 - 22:43
 */
@Configuration
public class MetaObjectHandlerConfguration {

    @Bean
    MetaObjectHandler metaObjectHandler(){
        return new MetaObjectHandler() {
            @Override
            public void insertFill(MetaObject metaObject) {
                this.setFieldValByName("createTime",new Date(), metaObject);
            }

            @Override
            public void updateFill(MetaObject metaObject) {
                this.setFieldValByName("updateTime",new Date(), metaObject);
            }
        };
    }
}
