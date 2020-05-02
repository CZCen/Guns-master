package cn.stylefeng.guns.modular.service.impl;

import cn.stylefeng.guns.modular.dao.WorkTicketDao;
import cn.stylefeng.guns.modular.entity.WorkTicket;
import cn.stylefeng.guns.modular.service.WorkTicketService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (WorkTicket)表服务实现类
 *
 * @author makejava
 * @since 2020-04-29 17:05:46
 */
@Service("workTicketService")
public class WorkTicketServiceImpl  implements WorkTicketService  {
    @Resource
    private WorkTicketDao workTicketDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WorkTicket queryById(Long id) {
        return this.workTicketDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<WorkTicket> queryAllByLimit(int offset, int limit) {
        return this.workTicketDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param workTicket 实例对象
     * @return 实例对象
     */
    @Override
    public WorkTicket insert(WorkTicket workTicket) {
        this.workTicketDao.insert(workTicket);
        return workTicket;
    }

    /**
     * 修改数据
     *
     * @param workTicket 实例对象
     * @return 实例对象
     */
    @Override
    public WorkTicket update(WorkTicket workTicket) {
        this.workTicketDao.update(workTicket);
        return this.queryById(workTicket.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.workTicketDao.deleteById(id) > 0;
    }
}