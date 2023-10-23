package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.repo;

import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity.UserEntity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface UserRepository  extends CrudRepository<UserEntity,String> {
//   List<UserEntity> findByUser_name(String name);
//   UserEntity findByUser_name(String name);

//    Optional<UserEntity> findAll(String name);
//    UserEntity findByUser_nameIs(String name);
/*List<UserEntity> findByUser_name(String user_name);*/
    List<UserEntity> findAll();
   /* Optional<UserEntity> findByUsername(String username);*/
}
