package cn.stylefeng.guns.modular.dao;

import cn.stylefeng.guns.modular.entity.AuditDanger;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (AuditDanger)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-29 17:05:45
 */
public interface AuditDangerDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AuditDanger queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AuditDanger> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param auditDanger 实例对象
     * @return 对象列表
     */
    List<AuditDanger> queryAll(AuditDanger auditDanger);

    /**
     * 新增数据
     *
     * @param auditDanger 实例对象
     * @return 影响行数
     */
    int insert(AuditDanger auditDanger);

    /**
     * 修改数据
     *
     * @param auditDanger 实例对象
     * @return 影响行数
     */
    int update(AuditDanger auditDanger);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}