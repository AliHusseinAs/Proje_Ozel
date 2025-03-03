package com.kayitSistem.demo.ServiceLayer;

import com.kayitSistem.demo.ModelLayer.Register;

public interface ServiceInterface {

    void Register(Register register); // POST
    void Login(String password, String user_name); // POST
    String ValidatePass(String password); // Not API
}
