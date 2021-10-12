package ericomonteiro.github.auth.service.security

import ericomonteiro.github.auth.model.security.mapper.UserMapper
import ericomonteiro.github.auth.repository.security.UserRepository
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

@Service
class CustomUserDetailsService(
    val userRepository: UserRepository,
    val userMapper: UserMapper
): UserDetailsService {

    override fun loadUserByUsername(email: String): UserDetails {
        val user = userRepository.findByEmail(email)
            ?: throw UsernameNotFoundException("user e-mail not found: $email")

        return userMapper.toUserDetail(user)
    }
}