package com.smim.mysql_db.repository;

import com.smim.mysql_db.table.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
}
