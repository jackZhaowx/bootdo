package com.bootdo.common.task;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

import com.bootdo.oa.domain.Response;

import java.security.Principal;

@Component
public class WelcomeJob implements Job{
	@Autowired
	SimpMessagingTemplate template;

    @Override
    public void execute(JobExecutionContext arg0) throws JobExecutionException {
    	template.convertAndSend("/topic/getResponse", new Response("欢迎体验使用汽车社团后台管理系统，如需帮助请联系管理员，QQ：1334272415" ));
    }

}