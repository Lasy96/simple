package com.yhl.model.enums;

import com.alibaba.dubbo.rpc.exception.DubboException;

/**
 * @author Lasy
 * @date 2018/6/22 13:51
 */
public enum MathUtilCase {
    /**
     * 随机数大小写
     */
    小写(1), 大写(2);

    int code;

    MathUtilCase(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static MathUtilCase valueOf(Integer code) {
        for (MathUtilCase cs : MathUtilCase.values()) {
            if (cs.getCode() == code) {
                return cs;
            }
        }
        throw new DubboException("删除状态【" + code + "】不是有效状态！");
    }
}
