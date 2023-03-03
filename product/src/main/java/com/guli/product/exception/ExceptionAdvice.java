package com.guli.product.exception;

import com.common.core.exception.client.ClientException;
import com.common.core.exception.server.ServerException;
import com.common.core.exception.thirdparty.ThirdPartyException;
import com.common.core.response.Response;
import com.common.core.response.ResponseBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * ExceptionAdvice
 *
 * @author Runhu-Wu
 * @date 2022/12/12
 */
@Slf4j
@RestControllerAdvice
public class ExceptionAdvice {

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
