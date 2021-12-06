package com.isaccanedo.calc.service.impl;

import org.springframework.stereotype.Service;

import com.isaccanedo.calc.model.Response;
import com.isaccanedo.calc.service.ResponseService;

@Service
public class ResponseServiceImpl implements ResponseService{
	
	@Override
	public Response getAdd(final int firstNumber , final int secondNumber) {
		Response response = new Response(firstNumber, secondNumber, 0 , "+");
		response.setAnswer(firstNumber + secondNumber);
		return response;
	}
	
	@Override
	public Response getAdd(final Response res) {
		Response response = new Response(res.getFirstNumber(), res.getSecondNumber(), 0 , "+");
		response.setAnswer(res.getFirstNumber() + res.getSecondNumber());
		return response;
	}
	
	@Override
	public Response getSub(final int firstNumber , final int secondNumber) {
		Response response = new Response(firstNumber, secondNumber, 0 , "-");
		response.setAnswer(firstNumber - secondNumber);
		return response;
	}
	
	@Override
	public Response getMultiply(final int firstNumber , final int secondNumber) {
		Response response = new Response(firstNumber, secondNumber, 0 , "*");
		response.setAnswer(firstNumber * secondNumber);
		return response;
	}
	
	@Override
	public Response getDevide(final int firstNumber , final int secondNumber) {
		Response response = new Response(firstNumber, secondNumber, 0 , "/");
		try {
			response.setAnswer(firstNumber / secondNumber);
			return response;
		}catch(ArithmeticException e) {
			e.printStackTrace();
			return response;
		}
	}

	@Override
	public Response getSub(Response res) {
		Response response = new Response(res.getFirstNumber(), res.getSecondNumber(), 0 , "-");
		response.setAnswer(res.getFirstNumber() - res.getSecondNumber());
		return response;
	}

	@Override
	public Response getMultiply(Response res) {
		Response response = new Response(res.getFirstNumber(), res.getSecondNumber(), 0 , "*");
		response.setAnswer(res.getFirstNumber() * res.getSecondNumber());
		return response;
	}

	@Override
	public Response getDevide(Response res) {
		Response response = new Response(res.getFirstNumber(), res.getSecondNumber(), 0 , "/");
		try {
			if(res.getSecondNumber() == 0) {
				throw new ResponseServiceException("You can't just / by zero!");
			}else {
				response.setAnswer(res.getFirstNumber() / res.getSecondNumber());
				return response;
			}
		}catch(ResponseServiceException e) {
//			e.printStackTrace();
			return response;
		}
	}
	
	 class ResponseServiceException extends RuntimeException{
		ResponseServiceException(final String message){
			super(message);
		}
	}

}
