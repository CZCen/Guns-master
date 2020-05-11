package cn.stylefeng.guns.modular.service.impl;

import cn.stylefeng.guns.modular.entity.AuditBottom;
import cn.stylefeng.guns.modular.dao.AuditBottomDao;
import cn.stylefeng.guns.modular.service.AuditBottomService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AuditBottom)表服务实现类
 *
 * @author makejava
 * @since 2020-04-29 17:05:45
 */
@Service("auditBottomService")
public class AuditBottomServiceImpl implements AuditBottomService {
    @Resource
    private AuditBottomDao auditBottomDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AuditBottom queryById(Long id) {
        return this.auditBottomDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<AuditBottom> queryAllByLimit(int offset, int limit) {
//        return this.auditBottomDao.queryAllByLimit(offset, limit);
        return null;
    }

    /**
     * 新增数据
     *
     * @param auditBottom 实例对象
     * @return 实例对象
     */
    @Override
    public AuditBottom insert(AuditBottom auditBottom) {
        this.auditBottomDao.insert(auditBottom);
        return auditBottom;
    }

    /**
     * 修改数据
     *
     * @param auditBottom 实例对象
     * @return 实例对象
     */
    @Override
    public AuditBottom update(AuditBottom auditBottom) {
        this.auditBottomDao.update(auditBottom);
        return this.queryById(auditBottom.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.auditBottomDao.deleteById(id) > 0;
    }
}