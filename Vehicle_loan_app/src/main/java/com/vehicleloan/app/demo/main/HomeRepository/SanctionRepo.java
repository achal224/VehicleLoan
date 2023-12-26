package com.vehicleloan.app.demo.main.HomeRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vehicleloan.app.demo.main.model.SanctionLetter;

public interface SanctionRepo  extends JpaRepository<SanctionLetter, Integer>{

}
