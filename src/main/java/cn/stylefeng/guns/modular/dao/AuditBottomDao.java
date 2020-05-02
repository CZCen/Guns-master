package cn.stylefeng.guns.modular.dao;

import cn.stylefeng.guns.modular.entity.AuditBottom;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (AuditBottom)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-29 17:05:45
 */
public interface AuditBottomDao extends BaseMapper<AuditBottom> {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AuditBottom queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AuditBottom> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param auditBottom 实例对象
     * @return 对象列表
     */
    List<AuditBottom> queryAll(AuditBottom auditBottom);

    /**
     * 新增数据
     *
     * @param auditBottom 实例对象
     * @return 影响行数
     */
    int insert(AuditBottom auditBottom);

    /**
     * 修改数据
     *
     * @param auditBottom 实例对象
     * @return 影响行数
     */
    int update(AuditBottom auditBottom);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}