package com.example.controle.service;

import com.example.controle.dao.entities.Computer;
import com.example.controle.service.dtos.ComputerDTO;

public interface ComputerManager {

    Computer getComputer(Long id_Pc);


    void deleteComputer(Long id_Pc);

    ComputerDTO saveComputer(ComputerDTO computer);
}
