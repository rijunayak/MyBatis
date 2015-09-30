import java.util.List;

public interface PersonMapper {

    public void insertPerson(Person person);
    public Person getPersonById(Integer userId);
    public List<Person> getAllPersons();
    public void updatePerson(Person person);
    public void deletePerson(Integer userId);
}
