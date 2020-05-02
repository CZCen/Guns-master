package cn.stylefeng.guns.modular.controller;

import cn.stylefeng.guns.modular.entity.WorkUnit;
import cn.stylefeng.guns.modular.service.WorkUnitService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (WorkUnit)表控制层
 *
 * @author makejava
 * @since 2020-04-29 17:05:46
 */
@Controller
@RequestMapping("workUnit")
public class WorkUnitController {
    /**
     * 服务对象
     */
    @Resource
    private WorkUnitService workUnitService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public WorkUnit selectOne(Long id) {
        return this.workUnitService.queryById(id);
    }

}