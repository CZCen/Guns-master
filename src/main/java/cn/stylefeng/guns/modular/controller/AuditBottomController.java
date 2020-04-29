package cn.stylefeng.guns.modular.controller;

import cn.stylefeng.guns.modular.entity.AuditBottom;
import cn.stylefeng.guns.modular.service.AuditBottomService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (AuditBottom)表控制层
 *
 * @author makejava
 * @since 2020-04-29 17:05:45
 */
@RestController
@RequestMapping("auditBottom")
public class AuditBottomController {
    /**
     * 服务对象
     */
    @Resource
    private AuditBottomService auditBottomService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public AuditBottom selectOne(Long id) {
        return this.auditBottomService.queryById(id);
    }

}