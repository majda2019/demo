package univ.fac.master.dao;

import java.util.Hashtable;

import univ.fac.master.objects.Personne;

public class PersonneDaoImpl  implements IPersonneDao{
Hashtable<Long, Personne> personnes = new Hashtable<Long, Personne>();
	@Override
	public Hashtable<Long, Personne> findAllPersons() {
		
		return personnes;
	}

	@Override
	public Personne addPerson(Personne personne) {
		personnes.put(personne.getId(), personne);
		return personne;
	}

	@Override
	public Personne updatePerson(Personne personne) {
		personnes.put(personne.getId(), personne);
		return personne;
	}

	@Override
	public Personne deletePerson(Long id) {
		Personne p = findPersonById(id);
		personnes.remove(id);
		return p;
	}

	@Override
	public Personne findPersonById(Long id) {
	return personnes.get(id);
	}

}
