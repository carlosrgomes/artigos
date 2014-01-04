package br.com.blog.spring.profile;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/pessoa")
public class PessoaController {
	
	@Autowired
	private Pessoa pessoa;

	@RequestMapping(value="iniciar",method = RequestMethod.GET)
	public @ResponseBody String iniciar(){
		return pessoa.getNome();
	}
}
