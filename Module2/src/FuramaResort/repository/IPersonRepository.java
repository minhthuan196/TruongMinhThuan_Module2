package FuramaResort.repository;

import java.util.List;

public interface IPersonRepository<O> {
    List<O> showPerson();

    void createPerson(O o);

    void updatePerson(O o);

    void removePerson(String id);

    List<O> findPerson(String name);

}
