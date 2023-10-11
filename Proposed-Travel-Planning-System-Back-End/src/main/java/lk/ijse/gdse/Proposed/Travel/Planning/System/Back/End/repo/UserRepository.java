package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.repo;

import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
public interface UserRepository  extends JpaRepository<UserEntity,String> {
    UserEntity save(UserEntity userEntity);
    /*UserEntity getUserEntitiesByUserId(String user_id);


    void deleteByUser(String id);*/
}
