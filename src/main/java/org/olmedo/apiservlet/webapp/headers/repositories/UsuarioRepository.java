package org.olmedo.apiservlet.webapp.headers.repositories;

import org.olmedo.apiservlet.webapp.headers.models.entities.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario> {
    Usuario porUsername(String username) throws Exception;
}
