package cn.haohan.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.haohan.ssm.po.HhCustom;
import cn.haohan.ssm.po.HhCustomVo;
import cn.haohan.ssm.service.CustomService;

@Controller
public class CustomController {
	
	@Autowired
	CustomService customService;
	
	//模糊查询客户
	@RequestMapping("/findAllCustom")
	public ModelAndView findAllCustom(HhCustomVo hhCustomVo) throws Exception {
		List<HhCustom> customlist = customService.findAllCustom(hhCustomVo);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("customlist", customlist);
		modelAndView.setViewName("customlist");
		return modelAndView;
	}
	
	//根据客户id查询
		public ModelAndView findCustomByid(Integer id) throws Exception {
			HhCustom hhCustom = customService.findCustomById(id);
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("hhCustom", hhCustom);
			modelAndView.setViewName("customlist");
			return modelAndView;
		}
}
