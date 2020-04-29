package cn.stylefeng.guns.modular.service;

import cn.stylefeng.guns.modular.entity.WorkTicket;
import java.util.List;

/**
 * (WorkTicket)表服务接口
 *
 * @author makejava
 * @since 2020-04-29 17:05:46
 */
public interface WorkTicketService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WorkTicket queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<WorkTicket> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param workTicket 实例对象
     * @return 实例对象
     */
    WorkTicket insert(WorkTicket workTicket);

    /**
     * 修改数据
     *
     * @param workTicket 实例对象
     * @return 实例对象
     */
    WorkTicket update(WorkTicket workTicket);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}