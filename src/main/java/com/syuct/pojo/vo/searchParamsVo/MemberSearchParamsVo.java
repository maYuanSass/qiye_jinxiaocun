package com.syuct.pojo.vo.searchParamsVo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Zsz
 * @Date 2022/1/8 15:17
 * @Version 1.0
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberSearchParamsVo {


    private int id;
    private String name;
    private String phone;
}
