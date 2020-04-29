package cn.stylefeng.guns.modular.controller;

import cn.stylefeng.guns.modular.entity.WorkPeople;
import cn.stylefeng.guns.modular.service.WorkPeopleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (WorkPeople)表控制层
 *
 * @author makejava
 * @since 2020-04-29 17:05:46
 */
@RestController
@RequestMapping("workPeople")
public class WorkPeopleController {
    /**
     * 服务对象
     */
    @Resource
    private WorkPeopleService workPeopleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public WorkPeople selectOne(Long id) {
        return this.workPeopleService.queryById(id);
    }

}