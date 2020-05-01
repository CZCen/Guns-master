package cn.stylefeng.guns.modular.system.mapper;

import cn.stylefeng.guns.modular.entity.WorkPeople;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * (WorkPeople)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-29 17:05:46
 */
public interface WorkPeopleMapper extends BaseMapper<WorkPeople> {

    Page<Map<String, Object>> selectWorkPeople(@Param("page") Page page, @Param("condition") String conditiion);

}