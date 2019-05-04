package com.machintosh1983.var.front.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.machintosh1983.var.front.service.UCTemplateService;

@Service("uCTemplateService")
public class UCTemplateServiceImpl implements UCTemplateService {
	private final static Logger logger = LoggerFactory.getLogger(UCTemplateServiceImpl.class); 

	@Override
	public String fetchByTemplateId(String tid) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> fetchByUserId(String uid, int num) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> fetchByKeywords(String keywords, int num) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> fetchByCategoryId(String gid, int num) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> fetchSharedTemplates(String keywords, String gid, int num) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean submitTemplate(String uid, String template) throws Exception {
		logger.info("submit template: "+template);
		return false;
	}

}
