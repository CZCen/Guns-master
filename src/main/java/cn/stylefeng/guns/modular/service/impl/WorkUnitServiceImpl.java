package cn.stylefeng.guns.modular.service.impl;

import cn.stylefeng.guns.modular.entity.WorkUnit;
import cn.stylefeng.guns.modular.dao.WorkUnitDao;
import cn.stylefeng.guns.modular.service.WorkUnitService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (WorkUnit)表服务实现类
 *
 * @author makejava
 * @since 2020-04-29 17:05:46
 */
@Service("workUnitService")
public class WorkUnitServiceImpl implements WorkUnitService {
    @Resource
    private WorkUnitDao workUnitDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WorkUnit queryById(Long id) {
        return this.workUnitDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<WorkUnit> queryAllByLimit(int offset, int limit) {
//        return this.workUnitDao.queryAllByLimit(offset, limit);
        return null;
    }

    /**
     * 新增数据
     *
     * @param workUnit 实例对象
     * @return 实例对象
     */
    @Override
    public WorkUnit insert(WorkUnit workUnit) {
        this.workUnitDao.insert(workUnit);
        return workUnit;
    }

    /**
     * 修改数据
     *
     * @param workUnit 实例对象
     * @return 实例对象
     */
    @Override
    public WorkUnit update(WorkUnit workUnit) {
        this.workUnitDao.update(workUnit);
        return this.queryById(workUnit.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.workUnitDao.deleteById(id) > 0;
    }
}