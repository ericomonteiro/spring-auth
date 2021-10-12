package ericomonteiro.github.auth.model.security

import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

class UserRepositoryUserDetails(
    id: Long, name: String, email: String, password: String, roles: List<Role>
) : User(id, name, email, password, roles), UserDetails {

    override fun getAuthorities(): List<GrantedAuthority> = this.roles

    override fun getPassword(): String = this.password

    override fun getUsername(): String = this.email

    override fun isAccountNonExpired(): Boolean = true

    override fun isAccountNonLocked(): Boolean = true

    override fun isCredentialsNonExpired(): Boolean = true

    override fun isEnabled(): Boolean = true
}