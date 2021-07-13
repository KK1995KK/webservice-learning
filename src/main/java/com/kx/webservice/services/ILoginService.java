package com.kx.webservice.services;

import javax.jws.WebService;
import java.util.Map;

@WebService(name = "LoginService", targetNamespace = "https://kx.cn")
public interface ILoginService {

    Map<String, Object> userLogin();
}
