package com.example.userpage.userpage.appuser;

import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface StudentRepository {
    Optional<AppUser> findByEmail(String email);
}
