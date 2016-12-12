package com.wxx;

/**
 * @author: wstar
 * @version: 1.0 version
 * @description:
 * @create time: 16-12-12 下午3:21
 */
public interface FunctionFacade<T> {

    boolean test(T t);

    default FunctionFacade<T> and(FunctionFacade ff){

        return t -> test(t) && ff.test(t);
    }

}
