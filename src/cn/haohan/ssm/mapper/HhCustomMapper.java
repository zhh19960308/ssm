package cn.haohan.ssm.mapper;

import cn.haohan.ssm.po.HhCustom;
import cn.haohan.ssm.po.HhCustomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HhCustomMapper {
    int countByExample(HhCustomExample example);

    int deleteByExample(HhCustomExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HhCustom record);

    int insertSelective(HhCustom record);

    List<HhCustom> selectByExample(HhCustomExample example);

    HhCustom selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HhCustom record, @Param("example") HhCustomExample example);

    int updateByExample(@Param("record") HhCustom record, @Param("example") HhCustomExample example);

    int updateByPrimaryKeySelective(HhCustom record);

    int updateByPrimaryKey(HhCustom record);
}