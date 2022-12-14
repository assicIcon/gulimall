package com.guli.pms.exception;

import com.common.exception.AbstractException;
import com.common.exception.client.*;
import com.common.exception.server.ServerException;
import com.common.exception.server.SystemResourceException;
import com.common.exception.thirdparty.DatabaseException;
import com.common.exception.thirdparty.EmailException;
import com.common.exception.thirdparty.ThirdPartyException;
import com.common.exception.thirdparty.WeChatException;
import com.common.response.Response;
import com.common.response.ResponseBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * PmsExceptionAdvice
 *
 * @author Runhu-Wu
 * @date 2022/12/12
 */
@Slf4j
@RestControllerAdvice
public class PmsExceptionAdvice {

	/**
	 * 客户端异常
	 *
	 * @param e 异常
	 * @return 状态码和描述信息
	 */
	@ExceptionHandler(ClientException.class)
	public Response<Void> clientException(ClientException e) {
		return ResponseBuilder.failure(e.getMessage());
	}

	/**
	 * 服务端异常
	 *
	 * @param e 异常
	 * @return 状态码和描述信息
	 */
	@ExceptionHandler(ServerException.class)
	public Response<Void> serverException(ServerException e) {
		log.error("server error ", e);
		return ResponseBuilder.failure(e.getMessage());
	}

	/**
	 * 第三方异常
	 *
	 * @param e 异常
	 * @return 状态码和描述信息
	 */
	@ExceptionHandler(ThirdPartyException.class)
	public Response<Void> thirdPartyException(ThirdPartyException e) {
		log.error("third party error ", e);
		return ResponseBuilder.failure(e.getMessage());
	}

}
