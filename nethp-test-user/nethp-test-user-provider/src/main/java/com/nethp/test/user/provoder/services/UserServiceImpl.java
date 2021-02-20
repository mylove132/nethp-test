package com.nethp.test.user.provoder.services;

import com.nethp.test.user.api.dto.request.QueryUserRequest;
import com.nethp.test.user.api.dto.response.QueryUserResponse;
import com.nethp.test.user.api.services.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    public QueryUserResponse queryUser(QueryUserRequest request) {
        QueryUserResponse response = new QueryUserResponse();
        response.setAge(10);
        response.setEmail("liuzhanhui@jd.com");
        response.setId(request.getUserId());
        response.setName("liuzhanhui");
        return response;
    }
}
