package com.vdong.rocketmq.consumer.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserInfo implements Serializable {

    private Integer id;

    private String userName;

}
