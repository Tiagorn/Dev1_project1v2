package com.tiagorsnp.ifrsdev1appv1r1;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.MediaType;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.*;

	import javax.print.attribute.standard.Media;
	import java.awt.*;

	

	@RestController // This means that this class is a Controller
	@RequestMapping(path="/category") // This means URL's start with /demo (after Application path)
	public class CategoryController {
	    @Autowired // This means to get the bean called userRepository
	    // Which is auto-generated by Spring, we will use it to handle the data
	    private com.tiagorsnp.ifrsdev1appv1r1.CategoryRepository CategoryRepository;

	    @PostMapping(path="/add") // Map ONLY POST Requests
	    public @ResponseBody String addNewCategory (@RequestParam String name) {
	        // @ResponseBody means the returned String is the response, not a view name
	        // @RequestParam means it is a parameter from the GET or POST request

	        com.tiagorsnp.ifrsdev1appv1r1.Category  n = new com.tiagorsnp.ifrsdev1appv1r1.Category();
	        n.setName(name);
	        CategoryRepository.save(n);
	        return "Saved";
	    }


	    @PostMapping(
	     value = "addp"
	    ,consumes = {MediaType.APPLICATION_JSON_VALUE}
	    ,produces = {MediaType.APPLICATION_JSON_VALUE}
	    ) // Map ONLY POST Requests
	    public @ResponseBody com.tiagorsnp.ifrsdev1appv1r1.Category addNewCategory (@RequestBody  com.tiagorsnp.ifrsdev1appv1r1.Category entidade) {
	        // @ResponseBody means the returned String is the response, not a view name
	        // @RequestParam means it is a parameter from the GET or POST request

	       CategoryRepository.save(entidade);


	        return entidade;
	    }


	    @GetMapping(path="/all")
	    public @ResponseBody Iterable<com.tiagorsnp.ifrsdev1appv1r1.Category> getAllCategories() {
	        // This returns a JSON or XML with the users
	        return CategoryRepository.findAll();
	    }



	    @PostMapping(
	            value = "teste"
	            ,consumes = {MediaType.APPLICATION_JSON_VALUE}
	            ,produces = {MediaType.APPLICATION_JSON_VALUE}
	    ) // Map ONLY POST Requests
	    public @ResponseBody com.tiagorsnp.ifrsdev1appv1r1.Category Teste (@RequestBody  com.tiagorsnp.ifrsdev1appv1r1.Category entidade) {
	        // @ResponseBody means the returned String is the response, not a view name
	        // @RequestParam means it is a parameter from the GET or POST request




	        return entidade;
	    }

	}
