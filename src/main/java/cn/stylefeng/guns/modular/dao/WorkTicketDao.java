package cn.stylefeng.guns.modular.dao;

import cn.stylefeng.guns.modular.entity.WorkTicket;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (WorkTicket)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-29 17:05:46
 */
public interface WorkTicketDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WorkTicket queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<WorkTicket> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param workTicket 实例对象
     * @return 对象列表
     */
    List<WorkTicket> queryAll(WorkTicket workTicket);

    /**
     * 新增数据
     *
     * @param workTicket 实例对象
     * @return 影响行数
     */
    int insert(WorkTicket workTicket);

    /**
     * 修改数据
     *
     * @param workTicket 实例对象
     * @return 影响行数
     */
    int update(WorkTicket workTicket);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}