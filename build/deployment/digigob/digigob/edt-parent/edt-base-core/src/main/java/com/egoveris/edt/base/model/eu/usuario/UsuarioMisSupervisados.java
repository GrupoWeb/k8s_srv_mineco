package com.egoveris.edt.base.model.eu.usuario;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.egoveris.edt.base.repository.eu.usuario.UsuarioGenerico;

@Entity
@Table(name = "EU_USUARIO_MISSUPERVISADOS")
public class UsuarioMisSupervisados extends UsuarioGenerico {

}
