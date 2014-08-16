package com.zh.web.action;

import java.util.HashMap;
import java.util.Map;

import org.activiti.engine.FormService;
import org.activiti.engine.IdentityService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.runtime.ProcessInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.zh.core.base.action.Action;
import com.zh.core.base.action.BaseAction;
import com.zh.web.model.RecruitmentModel;
import com.zh.web.model.bean.TechnologicalProcess;
import com.zh.web.service.TechnologicalProcessService;

public class RecruitmentAction extends BaseAction {
	
	/**
	 * 招聘工作流
	 */
	private static final long serialVersionUID = 1L;

	private RecruitmentModel recruitmentModel = new RecruitmentModel();
	
	private static Logger LOGGER = LoggerFactory.getLogger(RecruitmentAction.class); 
	
	@Autowired
	private TechnologicalProcessService technologicalProcessService;
	
	@Autowired
	protected RuntimeService runtimeService;

	@Autowired
	protected TaskService taskService;

	@Autowired
	protected RepositoryService repositoryService;
	
	@Autowired
	protected FormService FormService;

	@Autowired
	protected IdentityService identityService;
	
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return recruitmentModel;
	}
	
	public String execute() {
		LOGGER.debug("execute()");
		//TODO
		return Action.SUCCESS;
	}
	
	//保存表单
	public String save(){
		LOGGER.debug("save()");
		TechnologicalProcess technologicalProcess = this.recruitmentModel.getTechnologicalProcess();
		Integer id = technologicalProcess.getId();
		if(null != id && id>0)
		{
			technologicalProcessService.update(technologicalProcess);
		}else
		{
			technologicalProcessService.insert(technologicalProcess);
		}
		return Action.EDITOR;
	}
	
	
	//创建工作流
	public String createWorkflow(){
		LOGGER.debug("createWorkflow()");
		
		String businessKey = this.recruitmentModel.getFormId();
		String assignee = this.recruitmentModel.getAssign();
		Map<String, Object> variables = new HashMap<String, Object>();
		//variables.put("period", "2015-06");  
		variables.put("nextAssignee", assignee);
		
		ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("recruitment", businessKey, variables);
		
		String id = processInstance.getId();
		LOGGER.debug("processInstance.id: " + id);
		
		return Action.EDITOR;
	}
	

	public RecruitmentModel getRecruitmentModel() {
		return recruitmentModel;
	}

	public void setRecruitmentModel(RecruitmentModel recruitmentModel) {
		this.recruitmentModel = recruitmentModel;
	}

	public TechnologicalProcessService getTechnologicalProcessService() {
		return technologicalProcessService;
	}

	public void setTechnologicalProcessService(
			TechnologicalProcessService technologicalProcessService) {
		this.technologicalProcessService = technologicalProcessService;
	}

}