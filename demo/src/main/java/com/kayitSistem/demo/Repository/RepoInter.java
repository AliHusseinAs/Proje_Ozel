package com.kayitSistem.demo.Repository;

import com.kayitSistem.demo.ModelLayer.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoInter extends JpaRepository<Register, Long>{

}


