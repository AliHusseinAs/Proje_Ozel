package com.kayitSistem.demo.ServiceLayer;

import com.kayitSistem.demo.ModelLayer.Register;
import com.kayitSistem.demo.Repository.RepoInter;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;

@Service
@Transactional
public class ServiceClass implements ServiceInterface{

    private final RepoInter repoInter;
    private final PasswordEncoder passwordEncoder;

    public ServiceClass(PasswordEncoder passwordEncoder, RepoInter repoInter) {
        this.passwordEncoder = passwordEncoder;
        this.repoInter = repoInter;
    }

    // pss encoder
    // check user_name
    // JWT arastir
    // DTO

    @Override
    public void Register(Register register) {
//        String pass = register.getPassword();
//        String retr = ValidatePass(pass);
//        if(retr.matches("true")) {
//            String encodePas = passwordEncoder.encode(register.getPassword());
//            register.setPassword(encodePas);
            repoInter.save(register);
//        }
        // else lazim
    }
    // checl user_name {or validate
    // yarin'a
    @Override
    public void Login(String password, String user_name) {
    }


    @Override
    public String ValidatePass(String password) {
        if(password.length() < 8) {
            return "Sifre en az 8 karakterden olusmalidir";
        }
        if (!password.matches(".*[A-Z].*")) {
            return "sifre en az bir buyuk karakter icermelidir";
        }
        if (!password.matches(".*[0-9].*")) {
            return "sifre en az bir sayi icermelidir";
        }
        if (!password.matches(".*[a-z].*")) {
            return "sifre en az bir kucuk harf icermelidir";
        }
        if (!password.matches(".*[\\W_].*")) {
            return "sifre en az bir ozel karakter icermelidir";
        }
        return "true";
    }
}













