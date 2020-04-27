package cn.stylefeng.guns.modular.dao;

import cn.stylefeng.guns.modular.entity.WorkUnit;
import cn.stylefeng.guns.modular.entity.WorkUnitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkUnitMapper {
    long countByExample(WorkUnitExample example);

    int deleteByExample(WorkUnitExample example);

    int insert(WorkUnit record);

    int insertSelective(WorkUnit record);

    List<WorkUnit> selectByExample(WorkUnitExample example);

    int updateByExampleSelective(@Param("record") WorkUnit record, @Param("example") WorkUnitExample example);

    int updateByExample(@Param("record") WorkUnit record, @Param("example") WorkUnitExample example);
}