package cn.stylefeng.guns.modular.dao;

import cn.stylefeng.guns.modular.entity.WorkUnit;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (WorkUnit)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-29 17:05:46
 */
public interface WorkUnitDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WorkUnit queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<WorkUnit> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param workUnit 实例对象
     * @return 对象列表
     */
    List<WorkUnit> queryAll(WorkUnit workUnit);

    /**
     * 新增数据
     *
     * @param workUnit 实例对象
     * @return 影响行数
     */
    int insert(WorkUnit workUnit);

    /**
     * 修改数据
     *
     * @param workUnit 实例对象
     * @return 影响行数
     */
    int update(WorkUnit workUnit);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}