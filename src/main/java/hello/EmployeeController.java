package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/createPerson")
final class EmployeeController {
	private final EmployeeService service;
	@Autowired
	EmployeeController(EmployeeService service) {
        this.service = service;
    }
	@RequestMapping( method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    Person create(@RequestBody Person todoEntry) {
        return service.create(todoEntry);
    }

}
