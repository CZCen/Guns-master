package cn.stylefeng.guns.modular.service;

import cn.stylefeng.guns.modular.entity.Mgr;
import java.util.List;

/**
 * (Mgr)表服务接口
 *
 * @author makejava
 * @since 2020-04-29 17:05:45
 */
public interface MgrService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Mgr queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Mgr> queryAllByLimit(int offset, int limit,String condition,String typeName);

    int queryTotal();

    /**
     * 新增数据
     *
     * @param mgr 实例对象
     * @return 实例对象
     */
    Mgr insert(Mgr mgr);

    /**
     * 修改数据
     *
     * @param mgr 实例对象
     * @return 实例对象
     */
    Mgr update(Mgr mgr);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}