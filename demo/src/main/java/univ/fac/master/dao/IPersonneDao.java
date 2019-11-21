package univ.fac.master.dao;

import java.util.Hashtable;

import univ.fac.master.objects.Personne;

public interface IPersonneDao {

Hashtable<Long, Personne>	findAllPersons();
Personne addPerson(Personne personne);
Personne updatePerson(Personne personne);
Personne deletePerson(Long id);
Personne findPersonById(Long id);
}
