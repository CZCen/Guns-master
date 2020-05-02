package cn.stylefeng.guns.modular.service.impl;

import cn.stylefeng.guns.core.common.page.LayuiPageFactory;
import cn.stylefeng.guns.modular.entity.WorkPeople;
import cn.stylefeng.guns.modular.system.mapper.WorkPeopleMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (WorkPeople)表服务接口
 *
 * @author makejava
 * @since 2020-04-29 17:05:46
 */

@Service
public class WorkPeopleService extends ServiceImpl<WorkPeopleMapper, WorkPeople> {

    @Resource
    private WorkPeopleMapper workPeopleMapper;

    public Page<Map<String, Object>> selectWorkPeople(String conditiion,String typeName) {
        Page page = LayuiPageFactory.defaultPage();
        return this.baseMapper.selectWorkPeople(page,conditiion,typeName);
    }

    @Transactional
    public int delete(Long id) {
        QueryWrapper<WorkPeople> dictEntityWrapper = new QueryWrapper<>();
        dictEntityWrapper = dictEntityWrapper.eq("ID", id);
        return workPeopleMapper.delete(dictEntityWrapper);
    }

}