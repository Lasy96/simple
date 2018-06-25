package com.yhl.model.enums;

import com.alibaba.dubbo.rpc.exception.DubboException;

/**
 * @author 袁华
 * @date 2018/6/22 16:07
 */
public enum UserType {
    /**
     * 用户类型
     */
    吃瓜群众(0), 普通会员(1), 高级会员(2), 编辑(2);

    int code;

    UserType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static UserType valueOf(Integer code) {
        for (UserType cs : UserType.values()) {
            if (cs.getCode() == code) {
                return cs;
            }
        }
        throw new DubboException("删除状态【" + code + "】不是有效状态！");
    }
}
