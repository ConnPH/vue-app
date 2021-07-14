package vip.ph.mongo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.data.mongodb.core.convert.QueryMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vip.ph.mongo.pojo.State;
import vip.ph.mongo.service.StateService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Just be alive
 * @version 1.0
 * @date 2021-07-13 - 21:57
 */
@RestController
@RequestMapping("v1/api/state")
public class StateController {

    @Resource
    private StateService stateService;

    @RequestMapping("findAll")
    public List<State> findAll() {
        return stateService.list(new QueryWrapper<>(null));
    }

    @RequestMapping("save")
    public void save() {
        State state = new State();
        state.setTitle("xxxxxxxxxxxxxxxxxxx");
        stateService.saveOrUpdate(state);
    }

}
