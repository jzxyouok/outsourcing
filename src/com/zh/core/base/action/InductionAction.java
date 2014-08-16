package com.zh.core.base.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zh.base.model.ParamModel;

public class InductionAction extends BaseAction {
	
	/**
	 * 入职工作流
	 */
	private static final long serialVersionUID = 1L;

	private ParamModel paramModel = new ParamModel();
	
	private static Logger LOGGER = LoggerFactory.getLogger(InductionAction.class); 
	
	
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return paramModel;
	}
	
	public String execute() {
		LOGGER.debug("execute()");
		//TODO
		return Action.SUCCESS;
	}
	
	public String save(){
		LOGGER.debug("save()");
		//TODO
		return Action.EDITOR;
	}

	public ParamModel getParamModel() {
		return paramModel;
	}

	public void setParamModel(ParamModel paramModel) {
		this.paramModel = paramModel;
	}

}