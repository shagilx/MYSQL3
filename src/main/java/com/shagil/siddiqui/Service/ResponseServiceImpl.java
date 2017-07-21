package com.shagil.siddiqui.Service;

import com.shagil.siddiqui.Repository.ResponseRepository;
import com.shagil.siddiqui.model.OptionResponse;
import com.shagil.siddiqui.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gauravgarg on 20/7/17.
 */
@Service
public class ResponseServiceImpl implements IResponseService {

    private final ResponseRepository responseRepository;

    @Autowired
    public ResponseServiceImpl(ResponseRepository responseRepository) {
        this.responseRepository = responseRepository;
    }

    @Override
    public void addResponse(Response response) {
        for (OptionResponse or: response.getOptionResponseSet()){
            or.setResponse(response);
        }
        responseRepository.save(response);
    }

    @Override
    public Iterable<Response> getAll() {
        return responseRepository.findAll();
    }

    @Override
    public Integer getCountOfResponse(String userName, String skill) {
        return responseRepository.countDistinctByUserNameAndSkill(userName,skill);
    }
}
