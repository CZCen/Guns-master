package cn.stylefeng.guns.modular.service.impl;

import cn.stylefeng.guns.modular.entity.AuditDanger;
import cn.stylefeng.guns.modular.dao.AuditDangerDao;
import cn.stylefeng.guns.modular.service.AuditDangerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AuditDanger)表服务实现类
 *
 * @author makejava
 * @since 2020-04-29 17:05:45
 */
@Service("auditDangerService")
public class AuditDangerServiceImpl implements AuditDangerService {
    @Resource
    private AuditDangerDao auditDangerDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AuditDanger queryById(Long id) {
        return this.auditDangerDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<AuditDanger> queryAllByLimit(int offset, int limit) {
//        return this.auditDangerDao.queryAllByLimit(offset, limit);
        return null;
    }

    /**
     * 新增数据
     *
     * @param auditDanger 实例对象
     * @return 实例对象
     */
    @Override
    public AuditDanger insert(AuditDanger auditDanger) {
        this.auditDangerDao.insert(auditDanger);
        return auditDanger;
    }

    /**
     * 修改数据
     *
     * @param auditDanger 实例对象
     * @return 实例对象
     */
    @Override
    public AuditDanger update(AuditDanger auditDanger) {
        this.auditDangerDao.update(auditDanger);
        return this.queryById(auditDanger.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.auditDangerDao.deleteById(id) > 0;
    }
}