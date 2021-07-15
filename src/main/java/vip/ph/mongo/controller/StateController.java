package vip.ph.mongo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.swagger.models.auth.In;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import vip.ph.mongo.pojo.Result;
import vip.ph.mongo.pojo.State;
import vip.ph.mongo.pojo.StateDetail;
import vip.ph.mongo.service.StateDetailService;
import vip.ph.mongo.service.StateService;
import vip.ph.mongo.vo.StateVo;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Just be alive
 * @version 1.0
 * @date 2021-07-13 - 21:57
 */
@Controller
@RequestMapping("v1/api")
public class StateController {

    @Resource
    private StateService stateService;

    @Resource
    private StateDetailService stateDetailService;

    @RequestMapping("state/{id}")
    public String findAll(@PathVariable Integer id, ModelMap modelMap) {
        State state = stateService.getById(id);
        if (state != null) {
            modelMap.put("id", id);
            return "stateDetail";
        }
        return "redirect:/error";
    }

//    /**
//     * 根据ID查询统计明细
//     * @param stateId
//     */
//    @GetMapping("/getStateDetail")
//    @ResponseBody
//    public Map<String,List<StateVo>> getStateDetail(Integer stateId){
//        State state = stateService.getById(stateId);
//
//        QueryWrapper<StateDetail> stateDetailQueryWrapper = new QueryWrapper<>();
//        stateDetailQueryWrapper.eq("state_id",state.getId());
//        List<StateDetail> stateDetailList = stateDetailService.list(stateDetailQueryWrapper);
//        StateVo stateVo = new StateVo();
//        BeanUtils.copyProperties(state,stateVo);
//        stateVo.setStateDetailList(stateDetailList);
//
//        List<StateVo> list = new ArrayList<>();
//        list.add(stateVo);
//
//      Map<String,List<StateVo>> map  = new HashMap<>();
//      map.put("stateVo",list);
//        return map;
//    }


    /**
     * 根据ID查询统计明细
     * @param stateId
     */
    @GetMapping("/getStateDetail")
    @ResponseBody
    public Result getStateDetail(Integer stateId){
        State state = stateService.getById(stateId);

        QueryWrapper<StateDetail> stateDetailQueryWrapper = new QueryWrapper<>();
        stateDetailQueryWrapper.eq("state_id",state.getId());
        List<StateDetail> stateDetailList = stateDetailService.list(stateDetailQueryWrapper);
        StateVo stateVo = new StateVo();
        BeanUtils.copyProperties(state,stateVo);
        stateVo.setStateDetailList(stateDetailList);
        return Result.ok();
    }


}
