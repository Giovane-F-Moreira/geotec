package br.com.geotecmanutencao.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.geotecmanutencao.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		
		Categoria categoria = new Categoria(1, "Informatica");
		Categoria categoria2 = new Categoria(2, "Escritorio");
		
		List<Categoria> listaCategoria = new ArrayList<>();
		listaCategoria.add(categoria);
		listaCategoria.add(categoria2);
		
		return listaCategoria;
	}

}
