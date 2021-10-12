package ericomonteiro.github.auth.repository.security

import ericomonteiro.github.auth.model.security.Role
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RoleRepository: JpaRepository<Role, Long> {

}