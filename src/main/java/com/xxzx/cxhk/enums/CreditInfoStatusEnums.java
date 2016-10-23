package com.xxzx.cxhk.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Created by yanfeng on 16/10/23.
 */
@NoArgsConstructor
@AllArgsConstructor
public enum CreditInfoStatusEnums {
    VALID(1, "待审核"),
    CLOSED(2, "审核通过"),
    DELETED(3, "审核失败");

    @Getter
    private Integer code;
    @Getter
    private String desc;

    public static CreditInfoStatusEnums getValue(Integer code) {
        final CreditInfoStatusEnums[] values = CreditInfoStatusEnums.values();
        for (CreditInfoStatusEnums value : values) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }

}
