package vip.ph.mongo.vo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vip.ph.mongo.pojo.StateDetail;

import java.util.Date;
import java.util.List;

/**
 * @author Just be alive
 * @version 1.0
 * @date 2021-07-14 - 22:22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StateVo {
    // Caused by: java.net.NoRouteToHostException: No route to host: connect
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String title;

    private String description;

    private Integer personNum;

    private String endTime;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    private Date modifyTime;

    private Integer userId;

    private String userName;

    private String image;

    private List<StateDetail> stateDetailList;
}
