package com.gorilla.rm.springframe.handle;

import com.gorilla.rm.domain.ResultEntity;
import com.gorilla.rm.springframe.exception.BusinessException;
import com.gorilla.rm.util.ResultEntityUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 异常处理类
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 处理所有不可预期异常
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultEntity handleException(Exception e) {
        logger.error(e.getMessage(),e);
        return ResultEntityUtil.error(null, "操作异常");

    }

    /**
     * 处理所有业务异常
     * @param e
     * @return
     */
    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public ResultEntity handleBusinessException(BusinessException e){
        logger.info(e.getMessage(), e);
        return ResultEntityUtil.fail(null,e.getMessage());
    }


}
