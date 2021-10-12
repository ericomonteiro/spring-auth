package ericomonteiro.github.auth.repository.security

import ericomonteiro.github.auth.model.security.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: JpaRepository<User, Long> {

}