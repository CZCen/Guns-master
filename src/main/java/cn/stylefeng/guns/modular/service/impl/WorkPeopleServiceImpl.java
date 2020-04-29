package cn.stylefeng.guns.modular.service.impl;

import cn.stylefeng.guns.modular.entity.WorkPeople;
import cn.stylefeng.guns.modular.dao.WorkPeopleDao;
import cn.stylefeng.guns.modular.service.WorkPeopleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (WorkPeople)表服务实现类
 *
 * @author makejava
 * @since 2020-04-29 17:05:46
 */
@Service("workPeopleService")
public class WorkPeopleServiceImpl implements WorkPeopleService {
    @Resource
    private WorkPeopleDao workPeopleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WorkPeople queryById(Long id) {
        return this.workPeopleDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<WorkPeople> queryAllByLimit(int offset, int limit) {
        return this.workPeopleDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param workPeople 实例对象
     * @return 实例对象
     */
    @Override
    public WorkPeople insert(WorkPeople workPeople) {
        this.workPeopleDao.insert(workPeople);
        return workPeople;
    }

    /**
     * 修改数据
     *
     * @param workPeople 实例对象
     * @return 实例对象
     */
    @Override
    public WorkPeople update(WorkPeople workPeople) {
        this.workPeopleDao.update(workPeople);
        return this.queryById(workPeople.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.workPeopleDao.deleteById(id) > 0;
    }
}