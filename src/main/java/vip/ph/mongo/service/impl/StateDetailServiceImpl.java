package vip.ph.mongo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import vip.ph.mongo.mapper.StateDetailMapper;
import vip.ph.mongo.pojo.StateDetail;
import vip.ph.mongo.service.StateDetailService;

/**
 * @author Just be alive
 * @version 1.0
 * @date 2021-07-14 - 22:39
 */
@Service
public class StateDetailServiceImpl extends ServiceImpl<StateDetailMapper, StateDetail> implements StateDetailService {
}
