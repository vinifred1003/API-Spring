package dio.web.api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.web.api.handler.CampoObrigatorioException;
import dio.web.api.model.Usuario;

@Repository
public class UserRepository {
	public void save(Usuario usuario) {
		if(usuario.getLogin()==null) 
			throw new CampoObrigatorioException("login");
		if(usuario.getPassword()==null)
			throw new CampoObrigatorioException("password");
		
		if (usuario.getId() == null)
			System.out.println("SAVE - Recebendo usuario na camada de repositório");
		else
			System.out.println("UPDATE - Recebendo usuario na camada de repositório");

		System.out.println(usuario);
	}

	public void deleteById(Integer id) {
		System.out.println(String.format("DELETE/id - Recebendo o id: %d para exclusão de um Usuario", id));

		System.out.println(id);
	}

	public List<Usuario> findAll() {
		System.out.println("LIST - listando usuarios do sistema");
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("vini", "123456"));
		usuarios.add(new Usuario("jao", "senhaDoJao"));
		return usuarios;
	}

	public Usuario findById(Integer id) {
		System.out.println(String.format("FIND/id - Recebendo o id: %d para procura de um usuario", id));
		return new Usuario("vini", "123456");
	}

	public Usuario findByUsername(String username) {
		System.out.println(
				String.format("FIND/username - Recebendo o username: %s para procura de um usuario", username));
		return new Usuario("vini", "123456");
	}
}