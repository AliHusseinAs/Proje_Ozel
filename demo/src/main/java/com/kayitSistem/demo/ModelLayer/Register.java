package com.kayitSistem.demo.ModelLayer;

import com.kayitSistem.demo.Repository.RepoInter;
import jakarta.persistence.*;


@Entity
@Table(name = "users")
public class Register {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true, updatable = false, nullable = false)
    private Long id;
    @Column(name = "isim")
    private String isim;
    @Column(name = "soyisim")
    private String soyisim;
    @Column(name = "password")
    private String password;
    @Column(name = "user_name")
    private String user_name;
    @Column(name = "mail")
    private String mail;
    @Column(name = "telefon")
    private String telefon;

    public Register(Long id, String isim, String soyisim, String password, String user_name, String mail, String telefon) {
        this.id = id;
        this.isim = isim;
        this.soyisim = soyisim;
        this.password = password;
        this.user_name = user_name;
        this.mail = mail;
        this.telefon = telefon;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
