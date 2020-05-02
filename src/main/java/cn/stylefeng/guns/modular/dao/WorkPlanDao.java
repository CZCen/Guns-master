package cn.stylefeng.guns.modular.dao;

import cn.stylefeng.guns.modular.entity.WorkPlan;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (WorkPlan)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-29 17:05:46
 */
public interface WorkPlanDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WorkPlan queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<WorkPlan> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit,
                                   @Param("condition") String condition, @Param("typeName")  String typeName);

    int queryTotal();

    /**
     * 通过实体作为筛选条件查询
     *
     * @param workPlan 实例对象
     * @return 对象列表
     */
    List<WorkPlan> queryAll(WorkPlan workPlan);

    /**
     * 新增数据
     *
     * @param workPlan 实例对象
     * @return 影响行数
     */
    int insert(WorkPlan workPlan);

    /**
     * 修改数据
     *
     * @param workPlan 实例对象
     * @return 影响行数
     */
    int update(WorkPlan workPlan);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}