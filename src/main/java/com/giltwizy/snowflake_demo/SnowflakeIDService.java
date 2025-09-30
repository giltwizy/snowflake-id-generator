package com.giltwizy.snowflake_demo;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SnowflakeIDService {

    private final Snowflake snowflake;

    public SnowflakeIDService(@Value("${snowflake.worker-id:1}") long workerId,
                              @Value("${snowflake.datacenter-id:1}") long datacenterId) {
        this.snowflake = IdUtil.getSnowflake(workerId, datacenterId);
    }

    /**
     * Generates a unique, time-sortable ID using the Snowflake algorithm.
     *
     * @return a 64-bit unique ID
     */
    public long generateId() {
        return snowflake.nextId();
    }
}
