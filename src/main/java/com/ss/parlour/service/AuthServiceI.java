package com.ss.parlour.service;

import com.ss.parlour.util.bean.AuthRequestBean;
import com.ss.parlour.util.bean.AuthResponseBean;

public interface AuthServiceI {
    public AuthResponseBean login(AuthRequestBean authRequest);
}
