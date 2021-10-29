package com.bytecode.tratcms;

import com.bytecode.tratcms.repository.jpa.JpaCategoriaRepository;
import com.bytecode.tratcms.service.InstalacionService;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.bytecode.tratcms.model.entity")
@EnableJpaRepositories(basePackages = "com.bytecode.tratcms.repository.jpa")
public class Application implements CommandLineRunner {

	private Log logger = LogFactory.getLog(getClass());

	@Autowired
	private InstalacionService instalacionService;

	@Autowired
	private JpaCategoriaRepository jpaCategoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//instalacionService.init_usuarios();

		//CREACION DE UNA CATEGORIA
		/*Categoria categoria = new Categoria();
		categoria.setDescripcion("Esta es una categoria de ejemplo");
		categoria.setFecha(new Date());
		categoria.setNombre("Ctegoria1");

		categoria = jpaCategoriaRepository.save(categoria);*/

		//ACTUALIZACIÓN
		/*Categoria categoria;
		categoria = jpaCategoriaRepository.findById(1).get();
		categoria.setNombre("Actualizando ejemplo");
		jpaCategoriaRepository.save(categoria);*/

		//OBTENER
		/*jpaCategoriaRepository.findAll()
				.forEach(categoria -> {
					logger.info("La categoria es: " + categoria.getIdCategoria());
				}); */

		//BORRAR
		//jpaCategoriaRepository.deleteById(1);

	}
}
