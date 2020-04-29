package cn.stylefeng.guns.modular.service.impl;

import cn.stylefeng.guns.modular.entity.Mgr;
import cn.stylefeng.guns.modular.dao.MgrDao;
import cn.stylefeng.guns.modular.service.MgrService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Mgr)表服务实现类
 *
 * @author makejava
 * @since 2020-04-29 17:05:45
 */
@Service("mgrService")
public class MgrServiceImpl implements MgrService {
    @Resource
    private MgrDao mgrDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Mgr queryById(Long id) {
        return this.mgrDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Mgr> queryAllByLimit(int offset, int limit) {
        return this.mgrDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param mgr 实例对象
     * @return 实例对象
     */
    @Override
    public Mgr insert(Mgr mgr) {
        this.mgrDao.insert(mgr);
        return mgr;
    }

    /**
     * 修改数据
     *
     * @param mgr 实例对象
     * @return 实例对象
     */
    @Override
    public Mgr update(Mgr mgr) {
        this.mgrDao.update(mgr);
        return this.queryById(mgr.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.mgrDao.deleteById(id) > 0;
    }
}