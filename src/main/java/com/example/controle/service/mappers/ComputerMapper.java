package com.example.controle.service.mappers;

import com.example.controle.dao.entities.Computer;
import com.example.controle.service.dtos.ComputerDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class ComputerMapper {
    public ComputerDTO fromComputer(Computer computer){
        ComputerDTO computerDTO=new ComputerDTO();
        BeanUtils.copyProperties(computer,computerDTO);
        return  computerDTO;
    }
    public Computer fromComputerDTO(ComputerDTO computerDTO){
        Computer computer= new Computer();
        BeanUtils.copyProperties(computerDTO,computer);
        return computer;
    }

}
