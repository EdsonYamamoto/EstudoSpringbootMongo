package com.teste.main.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.NoArgsConstructor;

@ApiModel
@NoArgsConstructor

public class UsuarioModel extends PersonModel {
    private String email;

    @ApiModelProperty(position = 2, required = true, value = "email do usuario")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return this.email;
    }
}
