package com.enuaruke.mhs2.common;

/**
 * @author Aruke
 * @date 2021/7/22 9:44
 * @info
 */
public class ModelAndView {

    private String status;

    private Object data;

    public ModelAndView() {
    }

    public ModelAndView(String status, Object data) {
        this.status = status;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
