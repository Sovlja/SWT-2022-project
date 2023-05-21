package rs.ac.uns.ftn.svtvezbe07.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rs.ac.uns.ftn.svtvezbe07.model.entity.Group;

import java.util.List;
import java.util.Optional;

public interface GroupRepository extends JpaRepository <Group, Long> {

    Group findGroupById(Long Id);
    List<Group> findAllByDeleted(Boolean Deleted);
    Optional<Group> findGroupByNameAndDeleted(String Name, Boolean Deleted);
}
