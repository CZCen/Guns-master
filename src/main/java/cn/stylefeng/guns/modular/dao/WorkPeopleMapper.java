package cn.stylefeng.guns.modular.dao;

import cn.stylefeng.guns.modular.entity.WorkPeople;
import cn.stylefeng.guns.modular.entity.WorkPeopleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkPeopleMapper {
    long countByExample(WorkPeopleExample example);

    int deleteByExample(WorkPeopleExample example);

    int insert(WorkPeople record);

    int insertSelective(WorkPeople record);

    List<WorkPeople> selectByExample(WorkPeopleExample example);

    int updateByExampleSelective(@Param("record") WorkPeople record, @Param("example") WorkPeopleExample example);

    int updateByExample(@Param("record") WorkPeople record, @Param("example") WorkPeopleExample example);
}