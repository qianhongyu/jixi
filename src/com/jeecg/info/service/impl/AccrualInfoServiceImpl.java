package com.jeecg.info.service.impl;
import com.jeecg.info.service.AccrualInfoServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.jeecg.info.entity.AccrualInfoEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.io.Serializable;
import org.jeecgframework.core.util.ApplicationContextUtil;
import org.jeecgframework.core.util.MyClassLoader;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.web.cgform.enhance.CgformEnhanceJavaInter;

@Service("accrualInfoService")
@Transactional
public class AccrualInfoServiceImpl extends CommonServiceImpl implements AccrualInfoServiceI {

	
 	public void delete(AccrualInfoEntity entity) throws Exception{
 		super.delete(entity);
 		//执行删除操作增强业务
		this.doDelBus(entity);
 	}
 	
 	public Serializable save(AccrualInfoEntity entity) throws Exception{
 		Serializable t = super.save(entity);
 		//执行新增操作增强业务
 		this.doAddBus(entity);
 		return t;
 	}
 	
 	public void saveOrUpdate(AccrualInfoEntity entity) throws Exception{
 		super.saveOrUpdate(entity);
 		//执行更新操作增强业务
 		this.doUpdateBus(entity);
 	}
 	
 	/**
	 * 新增操作增强业务
	 * @param t
	 * @return
	 */
	private void doAddBus(AccrualInfoEntity t) throws Exception{
		//-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------
	 	
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}
 	/**
	 * 更新操作增强业务
	 * @param t
	 * @return
	 */
	private void doUpdateBus(AccrualInfoEntity t) throws Exception{
		//-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------
	 	
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}
 	/**
	 * 删除操作增强业务
	 * @param id
	 * @return
	 */
	private void doDelBus(AccrualInfoEntity t) throws Exception{
	    //-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------
	 	
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}
 	
 	private Map<String,Object> populationMap(AccrualInfoEntity t){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", t.getId());
		map.put("inputpeopleid", t.getInputpeopleid());
		map.put("rasicsrate", t.getRasicsrate());
		map.put("compoundmode", t.getCompoundmode());
		map.put("excessrate", t.getExcessrate());
		map.put("loanamount", t.getLoanamount());
		map.put("period", t.getPeriod());
		map.put("starttime", t.getStarttime());
		map.put("interesttime", t.getInteresttime());
		map.put("repaymentmode", t.getRepaymentmode());
		map.put("signingtime", t.getSigningtime());
		map.put("periodunit", t.getPeriodunit());
		map.put("endtime", t.getEndtime());
		map.put("examinepeople", t.getExaminepeople());
		return map;
	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @param t
	 * @return
	 */
 	public String replaceVal(String sql,AccrualInfoEntity t){
 		sql  = sql.replace("#{id}",String.valueOf(t.getId()));
 		sql  = sql.replace("#{inputpeopleid}",String.valueOf(t.getInputpeopleid()));
 		sql  = sql.replace("#{rasicsrate}",String.valueOf(t.getRasicsrate()));
 		sql  = sql.replace("#{compoundmode}",String.valueOf(t.getCompoundmode()));
 		sql  = sql.replace("#{excessrate}",String.valueOf(t.getExcessrate()));
 		sql  = sql.replace("#{loanamount}",String.valueOf(t.getLoanamount()));
 		sql  = sql.replace("#{period}",String.valueOf(t.getPeriod()));
 		sql  = sql.replace("#{starttime}",String.valueOf(t.getStarttime()));
 		sql  = sql.replace("#{interesttime}",String.valueOf(t.getInteresttime()));
 		sql  = sql.replace("#{repaymentmode}",String.valueOf(t.getRepaymentmode()));
 		sql  = sql.replace("#{signingtime}",String.valueOf(t.getSigningtime()));
 		sql  = sql.replace("#{periodunit}",String.valueOf(t.getPeriodunit()));
 		sql  = sql.replace("#{endtime}",String.valueOf(t.getEndtime()));
 		sql  = sql.replace("#{examinepeople}",String.valueOf(t.getExaminepeople()));
 		sql  = sql.replace("#{UUID}",UUID.randomUUID().toString());
 		return sql;
 	}
 	
 	/**
	 * 执行JAVA增强
	 */
 	private void executeJavaExtend(String cgJavaType,String cgJavaValue,Map<String,Object> data) throws Exception {
 		if(StringUtil.isNotEmpty(cgJavaValue)){
			Object obj = null;
			try {
				if("class".equals(cgJavaType)){
					//因新增时已经校验了实例化是否可以成功，所以这块就不需要再做一次判断
					obj = MyClassLoader.getClassByScn(cgJavaValue).newInstance();
				}else if("spring".equals(cgJavaType)){
					obj = ApplicationContextUtil.getContext().getBean(cgJavaValue);
				}
				if(obj instanceof CgformEnhanceJavaInter){
					CgformEnhanceJavaInter javaInter = (CgformEnhanceJavaInter) obj;
					javaInter.execute("accrual_info",data);
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception("执行JAVA增强出现异常！");
			} 
		}
 	}
}