package com.kx.webservice.services.impl;

import com.kx.webservice.services.ILoginService;

import javax.jws.WebService;
import java.util.HashMap;
import java.util.Map;
// To get wsdl data
// access the url: http://localhost:8080/webservice/loginApi?wsdl
@WebService(name = "LoginService", //于接口中的一致
        targetNamespace = "https://kx.cn", //于接口中的一致
        endpointInterface = "com.kx.webservice.services.ILoginService" // Location of interface
)
public class LoginServiceImpl implements ILoginService {
    @Override
    public Map<String, Object> userLogin() {
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("errorCode", "00000");
        resultMap.put("errorMsg", null);
        return resultMap;
    }
}
