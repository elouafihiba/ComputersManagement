package com.example.controle.service;

import com.example.controle.dao.entities.Computer;
import com.example.controle.dao.repositories.ComputerRepository;
import com.example.controle.service.dtos.ComputerDTO;
import com.example.controle.service.mappers.ComputerMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class ComputerManagerAction implements ComputerManager {
    private final ComputerRepository computerRepository;
    private final ComputerMapper dtoMapper;

    @Override
    public Computer getComputer(Long id_Pc) {
        Computer computer = computerRepository.findById(id_Pc).orElse(null);
        return computer;
    }

    @Override
    public void deleteComputer(Long id_Pc) {
        computerRepository.deleteById(id_Pc);
    }

    @Override
    public ComputerDTO saveComputer(ComputerDTO computer) {
        Computer computer1=dtoMapper.fromComputerDTO(computer);
        Computer savedComputer= computerRepository.save(computer1);
        return dtoMapper.fromComputer(savedComputer);
    }


}
