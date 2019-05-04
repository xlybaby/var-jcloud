package com.machintosh1983.var.front.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

public interface UCTemplateService {

	public String fetchByTemplateId( String tid ) throws Exception;
	public List<String> fetchByUserId( String uid, int num ) throws Exception ;
	public List<String> fetchByKeywords( String keywords, int num ) throws Exception;
	public List<String> fetchByCategoryId( String gid, int num ) throws Exception;
	public List<String> fetchSharedTemplates( String keywords, String gid, int num ) throws Exception;
		
	public boolean submitTemplate( String uid, String template ) throws Exception;
}
