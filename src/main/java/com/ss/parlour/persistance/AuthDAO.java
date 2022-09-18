package com.ss.parlour.persistance;

import com.ss.parlour.util.bean.AuthRequestBean;
import com.ss.parlour.util.bean.UserBean;
import com.ss.parlour.util.exception.runtime.ParlourGeneralException;
import org.springframework.stereotype.Component;

@Component
public class AuthDAO implements DAOI {

    public UserBean login(AuthRequestBean authRequestBean){
        //todo validate and return userBean
        UserBean userBean=null;
        if(userBean==null)
        throw new ParlourGeneralException("Invalid userName/password");
        return null;
    }
}
