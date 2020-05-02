package cn.stylefeng.guns.modular.controller;

import cn.stylefeng.guns.modular.entity.Mgr;
import cn.stylefeng.guns.modular.service.MgrService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Mgr)表控制层
 *
 * @author makejava
 * @since 2020-04-29 17:05:45
 */
@Controller
@RequestMapping("mgr")
public class MgrController {
    /**
     * 服务对象
     */
    @Resource
    private MgrService mgrService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Mgr selectOne(Long id) {
        return this.mgrService.queryById(id);
    }

}