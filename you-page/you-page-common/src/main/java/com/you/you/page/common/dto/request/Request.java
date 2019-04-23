package com.you.you.page.common.dto.request;

import com.you.you.page.common.dto.request.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * 请求对象
 *
 *
 * @date 2018/4/16
 */
@ApiModel(value = "请求对象", description = "请求对象")
public class Request<T> extends BaseRequest {

    private static final long serialVersionUID = 1L;

    /**
     * 请求参数，可为基本类型（包装类），可以为其它可序列化对象
     */
    @ApiModelProperty(value = "请求参数，可为基本类型（包装类），可以为其它可序列化对象", name = "data")
    @Valid
    @NotNull(message = "参数不能为空!")
    private T data;

    public Request() {
    }

    public Request(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


    public Request<T> cip(String cip) {
        return this;
    }

    public Request<T> data(T data) {
        this.setData(data);
        return this;
    }

    public static <T> Request<T> create() {
        Request<T> result = new Request<T>();
        return result;
    }

    @Override
    public String toString() {
        return "Request{" +
                "data=" + data +
                '}'+"-"+super.toString();
    }
}
