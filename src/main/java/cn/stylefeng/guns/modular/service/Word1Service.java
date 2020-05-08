package cn.stylefeng.guns.modular.service;

import cn.stylefeng.guns.modular.entity.Word1;
import java.util.List;

/**
 * (Word1)表服务接口
 *
 * @author makejava
 * @since 2020-05-08 19:34:21
 */
public interface Word1Service {

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    Word1 queryById( );

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Word1> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param word1 实例对象
     * @return 实例对象
     */
    Word1 insert(Word1 word1);

    /**
     * 修改数据
     *
     * @param word1 实例对象
     * @return 实例对象
     */
    Word1 update(Word1 word1);

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 是否成功
     */
    boolean deleteById( );

}