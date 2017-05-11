package com.pranical.tutorial.main;

import com.pranical.tutorial.domain.Usuario;
import com.pranical.tutorial.util.JsonTransformer;
import com.pranical.tutorial.util.JsonTransformerImpl;

public class Run {

	public static void main(String[] args) {
		JsonTransformer jsonTransformer = new JsonTransformerImpl();

		Usuario usuario=new Usuario("Alberto Tortosa","alberto_tortosa@gmail.com",91);
        
        String jsonUsuario=jsonTransformer.toJson(usuario);
         
        System.out.println(jsonUsuario);
         
         
        Usuario newUsuario=(Usuario) jsonTransformer.fromJSON(jsonUsuario, Usuario.class);
           
        System.out.println("Usuario nuevo: "+newUsuario.toString());
 
	}

}
