package cn.stylefeng.guns.modular.dao;

import cn.stylefeng.guns.modular.entity.WorkPlan;
import cn.stylefeng.guns.modular.entity.WorkPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkPlanMapper {
    long countByExample(WorkPlanExample example);

    int deleteByExample(WorkPlanExample example);

    int insert(WorkPlan record);

    int insertSelective(WorkPlan record);

    List<WorkPlan> selectByExample(WorkPlanExample example);

    int updateByExampleSelective(@Param("record") WorkPlan record, @Param("example") WorkPlanExample example);

    int updateByExample(@Param("record") WorkPlan record, @Param("example") WorkPlanExample example);
}