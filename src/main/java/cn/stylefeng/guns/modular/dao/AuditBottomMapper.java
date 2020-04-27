package cn.stylefeng.guns.modular.dao;

import cn.stylefeng.guns.modular.entity.AuditBottom;
import cn.stylefeng.guns.modular.entity.AuditBottomExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AuditBottomMapper {
    long countByExample(AuditBottomExample example);

    int deleteByExample(AuditBottomExample example);

    int insert(AuditBottom record);

    int insertSelective(AuditBottom record);

    List<AuditBottom> selectByExample(AuditBottomExample example);

    int updateByExampleSelective(@Param("record") AuditBottom record, @Param("example") AuditBottomExample example);

    int updateByExample(@Param("record") AuditBottom record, @Param("example") AuditBottomExample example);
}