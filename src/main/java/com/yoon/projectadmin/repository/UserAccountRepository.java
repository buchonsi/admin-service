package com.yoon.projectadmin.repository;

import com.yoon.projectadmin.domain.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount, String> {
}
