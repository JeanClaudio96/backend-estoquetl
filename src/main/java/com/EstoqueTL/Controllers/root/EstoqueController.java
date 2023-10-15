package com.EstoqueTL.Controllers.root;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/estoque")
public class EstoqueController {

	@GetMapping(path = "")
	public String estoqueGet() {
		return "root/estoquePage";
	}
}