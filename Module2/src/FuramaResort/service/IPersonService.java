package FuramaResort.service;

import java.util.List;

public interface IPersonService<O> {
    List<O> showPerson();

    void createPerson(O o);

    void updatePerson(O o);

    void removePerson(String id);

    List<O> findPerson(String name);
}
