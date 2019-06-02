package com.teste.main.controller;

import com.teste.main.model.UsuarioModel;
import com.teste.main.repository.UsuarioRepository;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
@Api(value = "ControllerUsuario", description = "Voltado para manipualação de dados do usuario")
@RequestMapping("/Usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @RequestMapping(
            value = "/",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    public String indexUsuario() {
        return "Controller usuario";
    }

    @RequestMapping(
            value = "/GetUser/{ID}",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    public UsuarioModel GetUsuario(@RequestParam("ID") String ID) {
        return usuarioRepository.findById(ID).get();
    }


    @RequestMapping(
            value = "/GetAllUser",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    public List<UsuarioModel> GetAllUsuario(@RequestBody UsuarioModel user ) {
        return usuarioRepository.findAll();
    }


    @RequestMapping(
            value = "/Save/User",
            method = RequestMethod.POST,
            produces = "application/json"
    )
    public String SaveUsuario(@RequestBody UsuarioModel user ) {
        usuarioRepository.save(user);
        return "usuario era para ter sido salvo";
    }


    @RequestMapping(
            value = "/DeletarUsuario/{ID}",
            method = RequestMethod.DELETE,
            produces = "application/json"
    )
    public void Deletarusaurio(@RequestParam("ID") String ID ) {
        try {
            usuarioRepository.deleteById(ID);
        }catch (Exception e){
        }finally {
            return;
        }
    }

}

