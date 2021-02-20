package com.nethp.test.user.api.dto.request;
import lombok.Data;
import java.io.Serializable;

@Data
public class QueryUserRequest implements Serializable {

    private Integer userId;
}
