package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.repo;

import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<AdminEntity,String> {
  AdminEntity save(AdminEntity adminEntity);
  AdminEntity getById(String id);
  void  deleteById(String id);
}
