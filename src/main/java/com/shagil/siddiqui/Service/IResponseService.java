package com.shagil.siddiqui.Service;

import com.shagil.siddiqui.model.Response;

/**
 * Created by gauravgarg on 20/7/17.
 */
public interface IResponseService {
    void addResponse(Response response);
    Iterable<Response> getAll();
    Integer getCountOfResponse(String userName, String skill);
}
