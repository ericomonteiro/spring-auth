package ericomonteiro.github.auth.model.security.mapper

import ericomonteiro.github.auth.model.security.User
import ericomonteiro.github.auth.model.security.UserRepositoryUserDetails
import org.springframework.stereotype.Component

@Component
class UserMapper {

    fun toUserDetail(user: User): UserRepositoryUserDetails =
        UserRepositoryUserDetails(
            id = user.id,
            name = user.name,
            email = user.email,
            password = user.password,
            roles = user.roles
        )

}