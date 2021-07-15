package vip.ph.mongo.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Just be alive
 * @version 1.0
 * @date 2021-07-14 - 22:16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("gyz_state_detail")
public class StateDetail implements Serializable {

    // Caused by: java.net.NoRouteToHostException: No route to host: connect
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String title;

    private String itemNum;

    private Integer status;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    private Date modifyTime;

    private Integer userId;

    private Integer stateId;

    private String userName;
}

