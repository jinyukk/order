package com.jzy.order.exception;

import lombok.Data;

/**
 * @author jinziyu
 * @date 2020/4/24 21:15
 */
@Data
public class ServiceException extends RuntimeException {
    private Integer code;
    private String tip;

    public ServiceException() {
    }

    public ServiceException(ServiceExceptionEnum exceptionEnum) {
        this.code = exceptionEnum.code;
        this.tip = exceptionEnum.tip;
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException code(Integer code) {
        this.code = code;
        return this;
    }

    public ServiceException tip(String tip) {
        this.tip = tip;
        return this;
    }

}
