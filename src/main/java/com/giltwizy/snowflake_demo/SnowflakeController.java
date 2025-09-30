package com.giltwizy.snowflake_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/")
public class SnowflakeController {

    private final SnowflakeIDService snowflakeIDService;

    public SnowflakeController(SnowflakeIDService snowflakeIDService) {
        this.snowflakeIDService = snowflakeIDService;
    }

    @GetMapping(path = "generateid")
    public long generateSnowflakeId() {
        return snowflakeIDService.generateId();
    }
}
