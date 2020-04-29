package cn.stylefeng.guns.modular.service;

import cn.stylefeng.guns.modular.entity.WorkUnit;
import java.util.List;

/**
 * (WorkUnit)表服务接口
 *
 * @author makejava
 * @since 2020-04-29 17:05:46
 */
public interface WorkUnitService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WorkUnit queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<WorkUnit> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param workUnit 实例对象
     * @return 实例对象
     */
    WorkUnit insert(WorkUnit workUnit);

    /**
     * 修改数据
     *
     * @param workUnit 实例对象
     * @return 实例对象
     */
    WorkUnit update(WorkUnit workUnit);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}