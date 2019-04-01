package cn.haohan.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.haohan.ssm.mapper.CustomMapper;
import cn.haohan.ssm.mapper.HhCustomMapper;
import cn.haohan.ssm.po.HhCustom;
import cn.haohan.ssm.po.HhCustomVo;
import cn.haohan.ssm.service.CustomService;

public class CustomServiceImpl implements CustomService{
	
	@Autowired
	HhCustomMapper hhCustomMapper;
	@Autowired
	CustomMapper customMapper;
	@Override
	public HhCustom findCustomById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return hhCustomMapper.selectByPrimaryKey(id);
	}
	@Override
	public List<HhCustom> findAllCustom(HhCustomVo hhCustomVo) throws Exception {
		// TODO Auto-generated method stub
		return customMapper.findAllCustom(hhCustomVo);
	}

}
