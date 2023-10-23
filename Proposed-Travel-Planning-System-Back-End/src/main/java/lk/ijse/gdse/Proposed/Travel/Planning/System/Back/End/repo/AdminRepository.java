package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.repo;

import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity.AdminEntity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminRepository extends CrudRepository<AdminEntity,String> {
List<AdminEntity> findAll();
}
