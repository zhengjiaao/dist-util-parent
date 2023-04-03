/**
 * @Company: 上海数慧系统技术有限公司
 * @Department: 数据中心
 * @Author: 郑家骜[ào]
 * @Email: zhengja@dist.com.cn
 * @Date: 2022-06-10 14:24
 * @Since:
 */
package com.dist.util;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class StringUtilsTests {

    @Test
    public void test() {

        print("--------isEmpty():");
        print(StringUtils.isEmpty(null));
        print(StringUtils.isEmpty(""));
        print(StringUtils.isEmpty(" "));  // false
        print(StringUtils.isBlank(" null ")); //false

        print("--------isBlank():");
        print(StringUtils.isBlank(null));
        print(StringUtils.isBlank(""));
        print(StringUtils.isBlank(" "));
        print(StringUtils.isBlank(" null ")); //false

    }


    private void print(Object o) {
        System.out.println(o);
    }

}
