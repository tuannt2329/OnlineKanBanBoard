package rubikteam.kanban.reponsitory;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import rubikteam.kanban.model.User;

import java.util.List;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {


    @Query(value = "SELECT username,pass  FROM kanbanproj.users p WHERE p.username = :username and p.pass = :pass", nativeQuery = true)
    public List<User> find(@Param("username") String username, @Param("pass") String password);
}
