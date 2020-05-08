package cn.stylefeng.guns.modular.service;

import cn.stylefeng.guns.modular.entity.Word;
import java.util.List;

/**
 * (Word)表服务接口
 *
 * @author makejava
 * @since 2020-05-08 19:33:23
 */
public interface WordService {

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    Word queryById( );

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Word> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param word 实例对象
     * @return 实例对象
     */
    Word insert(Word word);

    /**
     * 修改数据
     *
     * @param word 实例对象
     * @return 实例对象
     */
    Word update(Word word);

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 是否成功
     */
    boolean deleteById( );

}