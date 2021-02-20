package com.nethp.test.user.api.dto.response;

import lombok.Data;

import java.io.Serializable;

@Data
public class QueryUserResponse implements Serializable {

    private Integer id;

    private String name;

    private Integer age;

    private String email;
}
