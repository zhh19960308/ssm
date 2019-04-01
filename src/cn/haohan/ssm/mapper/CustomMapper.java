package cn.haohan.ssm.mapper;

import java.util.List;

import cn.haohan.ssm.po.HhCustom;
import cn.haohan.ssm.po.HhCustomVo;

public interface CustomMapper {
	public List<HhCustom> findAllCustom(HhCustomVo hhCustomVo)throws Exception;
}
