package com.yhl.model.enums;

import com.alibaba.dubbo.rpc.exception.DubboException;

/**
 * @author 袁华
 * @date 2018/6/21 10:24
 */
public enum DeleteStatus {
    未删除(0), 已删除(1);

    int code;

    DeleteStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static DeleteStatus valueOf(Integer code) {
        for (DeleteStatus cs : DeleteStatus.values()) {
            if (cs.getCode() == code) {
                return cs;
            }
        }
        throw new DubboException("删除状态【" + code + "】不是有效状态！");
    }
}
