package cn.stylefeng.guns.modular.controller;

import cn.stylefeng.guns.modular.entity.WorkTicket;
import cn.stylefeng.guns.modular.service.WorkTicketService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (WorkTicket)表控制层
 *
 * @author makejava
 * @since 2020-04-29 17:05:46
 */
@RestController
@RequestMapping("workTicket")
public class WorkTicketController {
    /**
     * 服务对象
     */
    @Resource
    private WorkTicketService workTicketService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public WorkTicket selectOne(Long id) {
        return this.workTicketService.queryById(id);
    }

}