package com.pyg.entity;

import java.io.Serializable;

/**
 * 返回结果Bean
 *	@Create  on 	2018年8月9日		下午9:10:46
 *	@Author: Wq
 *	@E-mail: 1432114216@qq.com
 */
public class Result implements Serializable {

    private static final long serialVersionUID = -3948389268046368059L;

    private Integer code = 200;

    private String msg = "操作成功！";

    private Object data = null;

    public Result() {}

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static Result success() {
        Result result = new Result();
        result.setResultCode(ResultCode.SUCCESS);
        return result;
    }

    @Override
	public String toString() {
		return "Result [code=" + code + ", msg=" + msg + ", data=" + data + "]";
	}

	public static Result success(Object data) {
        Result result = new Result();
        result.setResultCode(ResultCode.SUCCESS);
        result.setData(data);
        return result;
    }
    public static Result success(Integer code, String msg, Object data) {
        Result result = new Result();
        result.setResultCode(ResultCode.SUCCESS);
        result.setData(data);
        return result;
    }
    
    public static Result failure(ResultCode resultCode) {
        Result result = new Result();
        result.setResultCode(resultCode);
        return result;
    }

    public static Result failure(ResultCode resultCode, Object data) {
        Result result = new Result();
        result.setResultCode(resultCode);
        result.setData(data);
        return result;
    }
    
    /**
     *   失败返回结果
     * @param resultCode	自定义错误码
     * @param msg		异常信息 
     * @param data		数据
     * @return	Result
     */
    public static Result failure(Integer resultCode, String msg,Object data) {
        Result result = new Result();
        result.setCode(resultCode);
        result.setData(data);
        result.setMsg(msg);
        return result;
    }
    
    /**
     *   失败返回结果
     * @param resultCode	自定义错误码
     * @param msg		异常信息 
     * @return	Result
     */
    public static Result failure(Integer resultCode, String msg) {
        Result result = new Result();
        result.setCode(resultCode);
        result.setMsg(msg);
        return result;
    }

    public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	

    public void setResultCode(ResultCode code) {
        this.code = code.code();
        this.msg = code.message();
    }
}


