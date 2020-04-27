package cn.stylefeng.guns.modular.dao;

import cn.stylefeng.guns.modular.entity.AuditDanger;
import cn.stylefeng.guns.modular.entity.AuditDangerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuditDangerMapper {
    long countByExample(AuditDangerExample example);

    int deleteByExample(AuditDangerExample example);

    int insert(AuditDanger record);

    int insertSelective(AuditDanger record);

    List<AuditDanger> selectByExample(AuditDangerExample example);

    int updateByExampleSelective(@Param("record") AuditDanger record, @Param("example") AuditDangerExample example);

    int updateByExample(@Param("record") AuditDanger record, @Param("example") AuditDangerExample example);
}