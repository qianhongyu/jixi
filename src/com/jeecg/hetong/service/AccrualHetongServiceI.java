package com.jeecg.hetong.service;
import com.jeecg.hetong.entity.AccrualHetongEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface AccrualHetongServiceI extends CommonService{
	
 	public void delete(AccrualHetongEntity entity) throws Exception;
 	
 	public Serializable save(AccrualHetongEntity entity) throws Exception;
 	
 	public void saveOrUpdate(AccrualHetongEntity entity) throws Exception;
 	
}
