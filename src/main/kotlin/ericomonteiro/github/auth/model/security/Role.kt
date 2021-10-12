package ericomonteiro.github.auth.model.security

import org.springframework.security.core.GrantedAuthority
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Role(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,
    val name: String
): GrantedAuthority {

    constructor(name: String) : this(id = 0L, name = name)

    override fun getAuthority(): String = this.name

}