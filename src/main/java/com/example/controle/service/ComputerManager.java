package com.example.controle.service;

import com.example.controle.service.dtos.ComputerDTO;

public interface ComputerManager {

    ComputerDTO getComputer(Long id_Pc);


    void deleteComputer(Long id_Pc);

    ComputerDTO saveComputer(ComputerDTO computer);
}
