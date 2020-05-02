package cn.stylefeng.guns.modular.controller;

import cn.stylefeng.guns.modular.entity.AuditDanger;
import cn.stylefeng.guns.modular.service.AuditDangerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (AuditDanger)表控制层
 *
 * @author makejava
 * @since 2020-04-29 17:05:45
 */
@Controller
@RequestMapping("auditDanger")
public class AuditDangerController {
    /**
     * 服务对象
     */
    @Resource
    private AuditDangerService auditDangerService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public AuditDanger selectOne(Long id) {
        return this.auditDangerService.queryById(id);
    }

}