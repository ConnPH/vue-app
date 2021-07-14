package vip.ph.mongo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vip.ph.mongo.mapper.StateMapper;
import vip.ph.mongo.pojo.State;
import vip.ph.mongo.service.StateService;

/**
 * @author Just be alive
 * @version 1.0
 * @date 2021-07-13 - 21:51
 */
@Service
@Transactional
public class StateServiceImpl extends ServiceImpl<StateMapper, State> implements StateService {
}
