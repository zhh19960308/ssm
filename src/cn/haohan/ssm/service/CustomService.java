package cn.haohan.ssm.service;

import java.util.List;

import cn.haohan.ssm.po.HhCustom;
import cn.haohan.ssm.po.HhCustomVo;

public interface CustomService {
	public HhCustom findCustomById(Integer id)throws Exception;
	public List<HhCustom> findAllCustom(HhCustomVo hhCustomVo)throws Exception;
}
