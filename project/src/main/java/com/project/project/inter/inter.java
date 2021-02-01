package com.project.project.inter;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD:project/src/main/java/com/project/project/inter/inter.java
import java.util.List;

=======
>>>>>>> c745332f47815d0592b516eb9d54eb26bfe8477f:project/src/main/java/com/project/project/inter/inter.java
import com.project.project.model.Person;

@Repository
public interface inter extends CrudRepository <Person, Integer>{
    List <Person> findByNameLike(String name);
}
