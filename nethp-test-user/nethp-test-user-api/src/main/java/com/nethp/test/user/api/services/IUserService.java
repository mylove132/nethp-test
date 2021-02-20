package com.nethp.test.user.api.services;

import com.nethp.test.user.api.dto.request.QueryUserRequest;
import com.nethp.test.user.api.dto.response.QueryUserResponse;

public interface IUserService {

    QueryUserResponse queryUser (QueryUserRequest request);
}
