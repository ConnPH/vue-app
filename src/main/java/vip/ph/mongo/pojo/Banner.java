package vip.ph.mongo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Just be alive
 * @version 1.0
 * @date 2021-07-08 - 21:28
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Banner {
    private String id;
    private String path;
    private Date createTime;
}
