package cn.stylefeng.guns.modular.dao;

import cn.stylefeng.guns.modular.entity.WorkTicket;
import cn.stylefeng.guns.modular.entity.WorkTicketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkTicketMapper {
    long countByExample(WorkTicketExample example);

    int deleteByExample(WorkTicketExample example);

    int insert(WorkTicket record);

    int insertSelective(WorkTicket record);

    List<WorkTicket> selectByExample(WorkTicketExample example);

    int updateByExampleSelective(@Param("record") WorkTicket record, @Param("example") WorkTicketExample example);

    int updateByExample(@Param("record") WorkTicket record, @Param("example") WorkTicketExample example);
}