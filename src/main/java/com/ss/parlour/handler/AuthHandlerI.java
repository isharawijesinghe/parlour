package com.ss.parlour.handler;

import com.ss.parlour.util.bean.AuthRequestBean;
import com.ss.parlour.util.bean.UserBean;

public interface AuthHandlerI {
    public UserBean login(AuthRequestBean authRequestBean);
}
