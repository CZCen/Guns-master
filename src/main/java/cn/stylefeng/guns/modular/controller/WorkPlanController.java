package cn.stylefeng.guns.modular.controller;

import cn.stylefeng.guns.modular.entity.WorkPlan;
import cn.stylefeng.guns.modular.service.WorkPlanService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (WorkPlan)表控制层
 *
 * @author makejava
 * @since 2020-04-29 17:05:46
 */
@RestController
@RequestMapping("workPlan")
public class WorkPlanController {
    /**
     * 服务对象
     */
    @Resource
    private WorkPlanService workPlanService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public WorkPlan selectOne(Long id) {
        return this.workPlanService.queryById(id);
    }

}