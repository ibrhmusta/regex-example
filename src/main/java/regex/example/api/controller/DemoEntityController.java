package regex.example.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import regex.example.business.abstracts.DemoEntityService;
import regex.example.entities.DemoEntity;

@RestController
@RequestMapping("api/demoentity")
public class DemoEntityController {

	private DemoEntityService demoEntityService;

	@Autowired
	public DemoEntityController(DemoEntityService demoEntityService) {
		super();
		this.demoEntityService = demoEntityService;
	}
	
	@PostMapping("/add")
	DemoEntity add(@RequestBody @Valid DemoEntity demoEntity) {
		return demoEntityService.add(demoEntity);
	}
}
