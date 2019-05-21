package cn.unicom.fj.uav.config;


import cn.unicom.fj.uav.common.SysHttpStatus;

import java.util.Date;

/**
 * 返回参数统一化
 * @author yinjunwu
 * @param <T>
 */
public class ResponseInfo<T> {

	private boolean success;
	private Integer code;
	private Date timestamp=new Date();
	private T data;
	private String msg;
	private String message;

	public ResponseInfo(T data) {
		this.success = SysHttpStatus.SUCCESS.isSuccess();
		this.msg = SysHttpStatus.SUCCESS.getMsg();
		this.data = data;
		this.code= 20000;
		this.message="";
	}

	public ResponseInfo(boolean success, String msg){
		this.success=success;
		this.msg=msg;
		if(success){
			this.code= 20000;
		}else {
			this.code = 30000;
		}
		this.message="";
	}

	public ResponseInfo(boolean success, T data, String msg) {
        this.data = data;
        this.success = success;
        this.msg = msg;
		if(success){
			this.code= 20000;
		}else {
			this.code = 30000;
		}
		this.message="";
    }

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
