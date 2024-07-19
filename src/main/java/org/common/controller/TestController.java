package org.common.controller;

import org.common.response.ResultData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: TestController
 * Package: org.common.controller
 * Description:
 *
 * @Author: @weixueshi
 * @Create: 2024/7/19 - 11:17
 * @Version: v1.0
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public ResultData test(){
        return ResultData.success("测试成功");
    }
}
