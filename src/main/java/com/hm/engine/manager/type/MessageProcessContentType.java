package com.hm.engine.manager.type;

import org.springframework.stereotype.Component;

import com.hm.engine.dao.graph.domain.GraphicProcess.ProcessContent;
import com.hm.engine.service.PushService;

@Component("message")
public class MessageProcessContentType implements IProcessContentType{

	@Override
	public void handle(ProcessContent processContent, PushService service) {
		// TODO Auto-generated method stub
		
	}

}
