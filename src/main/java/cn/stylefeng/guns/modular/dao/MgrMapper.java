package cn.stylefeng.guns.modular.dao;

import cn.stylefeng.guns.modular.entity.Mgr;
import cn.stylefeng.guns.modular.entity.MgrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MgrMapper {
    long countByExample(MgrExample example);

    int deleteByExample(MgrExample example);

    int insert(Mgr record);

    int insertSelective(Mgr record);

    List<Mgr> selectByExample(MgrExample example);

    int updateByExampleSelective(@Param("record") Mgr record, @Param("example") MgrExample example);

    int updateByExample(@Param("record") Mgr record, @Param("example") MgrExample example);
}