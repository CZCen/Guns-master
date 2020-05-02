package cn.stylefeng.guns.modular.service.impl;

import cn.stylefeng.guns.modular.entity.WorkPlan;
import cn.stylefeng.guns.modular.dao.WorkPlanDao;
import cn.stylefeng.guns.modular.service.WorkPlanService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (WorkPlan)表服务实现类
 *
 * @author makejava
 * @since 2020-04-29 17:05:46
 */
@Service("workPlanService")
public class WorkPlanServiceImpl implements WorkPlanService {
    @Resource
    private WorkPlanDao workPlanDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WorkPlan queryById(Long id) {
        return this.workPlanDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<WorkPlan> queryAllByLimit(int offset, int limit,String condition,String typeName) {
        return this.workPlanDao.queryAllByLimit(offset, limit,condition,typeName);
    }

    @Override
    public int queryTotal() {
        return this.workPlanDao.queryTotal();
    }


    /**
     * 新增数据
     *
     * @param workPlan 实例对象
     * @return 实例对象
     */
    @Override
    public WorkPlan insert(WorkPlan workPlan) {
        this.workPlanDao.insert(workPlan);
        return workPlan;
    }

    /**
     * 修改数据
     *
     * @param workPlan 实例对象
     * @return 实例对象
     */
    @Override
    public WorkPlan update(WorkPlan workPlan) {
        this.workPlanDao.update(workPlan);
        return this.queryById(workPlan.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.workPlanDao.deleteById(id) > 0;
    }
}