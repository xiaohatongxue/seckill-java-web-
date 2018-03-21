package org.seckill.exception;

/**
 * 秒杀相关业务异常
 *  Created by xiaoha on 18/01/01.
 */
public class SeckillException extends RuntimeException {

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
