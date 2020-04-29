package cn.stylefeng.guns.modular.service;

import cn.stylefeng.guns.modular.entity.AuditBottom;
import java.util.List;

/**
 * (AuditBottom)表服务接口
 *
 * @author makejava
 * @since 2020-04-29 17:05:45
 */
public interface AuditBottomService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AuditBottom queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AuditBottom> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param auditBottom 实例对象
     * @return 实例对象
     */
    AuditBottom insert(AuditBottom auditBottom);

    /**
     * 修改数据
     *
     * @param auditBottom 实例对象
     * @return 实例对象
     */
    AuditBottom update(AuditBottom auditBottom);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}