package univ.fac.master.controlleurs;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import univ.fac.master.dao.IPersonneDao;
import univ.fac.master.dao.PersonneDaoImpl;
import univ.fac.master.objects.Personne;
@RestController
public class PersonneController {
IPersonneDao personneDao = new PersonneDaoImpl();
@GetMapping("/personnes")
public Collection<Personne> getPersons(){
	return personneDao.findAllPersons().values();
	
}
@GetMapping("/form")
 public ModelAndView go() {
return new ModelAndView("personform.html");
}

@PostMapping("/personnes")
public Personne addPerson(@ModelAttribute Personne personne) {
	
	return personneDao.addPerson(personne);
	
}
@GetMapping("/personnes/{id}")
public Personne getPersonById(@PathVariable(value="id") Long id) {
	
	return personneDao.findPersonById(id);
	
}

@GetMapping("/suppersonnes/{id}")
public Personne supprimerPersonById(@PathVariable(value="id") Long id) {
	
	return personneDao.deletePerson(id);
	
}

}
