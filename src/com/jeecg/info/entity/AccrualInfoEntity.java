package com.jeecg.info.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.lang.String;
import java.lang.Double;
import java.lang.Integer;
import java.math.BigDecimal;
import javax.xml.soap.Text;
import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.SequenceGenerator;
import org.jeecgframework.poi.excel.annotation.Excel;

/**   
 * @Title: Entity
 * @Description: 基本信息表
 * @author onlineGenerator
 * @date 2018-01-08 14:39:53
 * @version V1.0   
 *
 */
@Entity
@Table(name = "accrual_info", schema = "")
@SuppressWarnings("serial")
public class AccrualInfoEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**录入人编号*/
	@Excel(name="录入人编号",width=15)
	private java.lang.String inputpeopleid;
	/**基础利率*/
	@Excel(name="基础利率",width=15)
	private java.lang.String rasicsrate;
	/**复利方式*/
	@Excel(name="复利方式",width=15,dictTable ="accrual_info_type",dicCode ="id",dicText ="type")
	private java.lang.String compoundmode;
	/**超额利率*/
	@Excel(name="超额利率",width=15)
	private java.lang.String excessrate;
	/**借贷金额*/
	@Excel(name="借贷金额",width=15)
	private java.lang.String loanamount;
	/**期间*/
	@Excel(name="期间",width=15)
	private java.lang.String period;
	/**起始日期*/
	@Excel(name="起始日期",width=15,format = "yyyy-MM-dd")
	private java.util.Date starttime;
	/**结息日*/
	@Excel(name="结息日",width=15,format = "yyyy-MM-dd")
	private java.util.Date interesttime;
	/**还款方式*/
	@Excel(name="还款方式",width=15,dictTable ="accrual_info_type1",dicCode ="id",dicText ="type1")
	private java.lang.String repaymentmode;
	/**合同签订日期*/
	@Excel(name="合同签订日期",width=15,format = "yyyy-MM-dd")
	private java.util.Date signingtime;
	/**期间单位*/
	@Excel(name="期间单位",width=15)
	private java.lang.String periodunit;
	/**结束日期*/
	@Excel(name="结束日期",width=15,format = "yyyy-MM-dd")
	private java.util.Date endtime;
	/**审核人*/
	@Excel(name="审核人",width=15)
	private java.lang.String examinepeople;
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  主键
	 */
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")

	@Column(name ="ID",nullable=false,length=36)
	public java.lang.String getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  主键
	 */
	public void setId(java.lang.String id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  录入人编号
	 */

	@Column(name ="INPUTPEOPLEID",nullable=true,length=50)
	public java.lang.String getInputpeopleid(){
		return this.inputpeopleid;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  录入人编号
	 */
	public void setInputpeopleid(java.lang.String inputpeopleid){
		this.inputpeopleid = inputpeopleid;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  基础利率
	 */

	@Column(name ="RASICSRATE",nullable=true,length=32)
	public java.lang.String getRasicsrate(){
		return this.rasicsrate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  基础利率
	 */
	public void setRasicsrate(java.lang.String rasicsrate){
		this.rasicsrate = rasicsrate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  复利方式
	 */

	@Column(name ="COMPOUNDMODE",nullable=true,length=50)
	public java.lang.String getCompoundmode(){
		return this.compoundmode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  复利方式
	 */
	public void setCompoundmode(java.lang.String compoundmode){
		this.compoundmode = compoundmode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  超额利率
	 */

	@Column(name ="EXCESSRATE",nullable=true,length=50)
	public java.lang.String getExcessrate(){
		return this.excessrate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  超额利率
	 */
	public void setExcessrate(java.lang.String excessrate){
		this.excessrate = excessrate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  借贷金额
	 */

	@Column(name ="LOANAMOUNT",nullable=true,length=50)
	public java.lang.String getLoanamount(){
		return this.loanamount;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  借贷金额
	 */
	public void setLoanamount(java.lang.String loanamount){
		this.loanamount = loanamount;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  期间
	 */

	@Column(name ="PERIOD",nullable=true,length=50)
	public java.lang.String getPeriod(){
		return this.period;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  期间
	 */
	public void setPeriod(java.lang.String period){
		this.period = period;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  起始日期
	 */

	@Column(name ="STARTTIME",nullable=true,length=50)
	public java.util.Date getStarttime(){
		return this.starttime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  起始日期
	 */
	public void setStarttime(java.util.Date starttime){
		this.starttime = starttime;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  结息日
	 */

	@Column(name ="INTERESTTIME",nullable=true,length=20)
	public java.util.Date getInteresttime(){
		return this.interesttime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  结息日
	 */
	public void setInteresttime(java.util.Date interesttime){
		this.interesttime = interesttime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  还款方式
	 */

	@Column(name ="REPAYMENTMODE",nullable=true,length=20)
	public java.lang.String getRepaymentmode(){
		return this.repaymentmode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  还款方式
	 */
	public void setRepaymentmode(java.lang.String repaymentmode){
		this.repaymentmode = repaymentmode;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  合同签订日期
	 */

	@Column(name ="SIGNINGTIME",nullable=true,length=32)
	public java.util.Date getSigningtime(){
		return this.signingtime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  合同签订日期
	 */
	public void setSigningtime(java.util.Date signingtime){
		this.signingtime = signingtime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  期间单位
	 */

	@Column(name ="PERIODUNIT",nullable=true,length=32)
	public java.lang.String getPeriodunit(){
		return this.periodunit;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  期间单位
	 */
	public void setPeriodunit(java.lang.String periodunit){
		this.periodunit = periodunit;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  结束日期
	 */

	@Column(name ="ENDTIME",nullable=true,length=32)
	public java.util.Date getEndtime(){
		return this.endtime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  结束日期
	 */
	public void setEndtime(java.util.Date endtime){
		this.endtime = endtime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  审核人
	 */

	@Column(name ="EXAMINEPEOPLE",nullable=true,length=32)
	public java.lang.String getExaminepeople(){
		return this.examinepeople;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  审核人
	 */
	public void setExaminepeople(java.lang.String examinepeople){
		this.examinepeople = examinepeople;
	}
}
