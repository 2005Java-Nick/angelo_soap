package com.revature.ws;

import javax.jws.WebService;

@WebService(endpointInterface="com.revature.ws.MessageGen",
serviceName="messageGenService")
public class MessageGenImpl implements MessageGen{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Hi Brian...";
	}

}
