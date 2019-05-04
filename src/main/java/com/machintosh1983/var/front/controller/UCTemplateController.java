package com.machintosh1983.var.front.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.machintosh1983.var.common.BaseController;
import com.machintosh1983.var.common.Constant;
import com.machintosh1983.var.front.service.UCTemplateService;


@RestController
@RequestMapping("/t")
public class UCTemplateController extends BaseController {

	@Autowired
	private UCTemplateService uCTemplateService;
	
	@RequestMapping(value="/byid", method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> fetchByTemplateId( @RequestBody TempalteVO tempalteVO, HttpServletRequest request ) throws Exception {
		
		return response(Constant.APPLICATION_RESPONSE_STATUS_CODE_OK, "", uCTemplateService.fetchByTemplateId(tempalteVO.getTemplateId()));
	}
	
	@RequestMapping(value="/byu", method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> fetchByUserId( @RequestBody TempalteVO tempalteVO, HttpServletRequest request ) throws Exception {
		
		return response(Constant.APPLICATION_RESPONSE_STATUS_CODE_OK, "", uCTemplateService.fetchByUserId(tempalteVO.getUserId(), tempalteVO.getNum()));
	}
	
	@RequestMapping(value="/bykwds", method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> fetchByKeywords( @RequestBody TempalteVO tempalteVO, HttpServletRequest request ) throws Exception {
		
		return response(Constant.APPLICATION_RESPONSE_STATUS_CODE_OK, "", uCTemplateService.fetchByKeywords(tempalteVO.getKeywords(), tempalteVO.getNum()));
	}
	
	@RequestMapping(value="/shared", method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> fetchSharedTemplates( @RequestBody TempalteVO tempalteVO, HttpServletRequest request ) throws Exception {
		
		return response(Constant.APPLICATION_RESPONSE_STATUS_CODE_OK, "", uCTemplateService.fetchSharedTemplates(null, null, tempalteVO.getNum()));
	}
	
	@RequestMapping(value="/sbt", method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> submitTemplate( @RequestBody TempalteVO tempalteVO, HttpServletRequest request ) throws Exception {
		
		return response(Constant.APPLICATION_RESPONSE_STATUS_CODE_OK, "", uCTemplateService.submitTemplate(tempalteVO.getUserId(), tempalteVO.getTemplate()));
	}
}
