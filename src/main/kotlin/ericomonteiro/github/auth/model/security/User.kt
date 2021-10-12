package ericomonteiro.github.auth.model.security

import javax.persistence.*

@Entity(name = "application_user")
open class User(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,
    val name: String,

    @Column(unique = true)
    val email: String,

    @get:JvmName("getUserPassword")
    val password: String,

    @ManyToMany(
        fetch = FetchType.EAGER,
        cascade = [CascadeType.ALL]
    )
    @JoinTable(
        name = "user_role",
        joinColumns = [JoinColumn(name = "user_id")],
        inverseJoinColumns = [JoinColumn(name = "role_id")]
    )
    val roles: List<Role>
) {
    constructor(name: String, email: String, password: String, role: Role) :
            this(0L, name = name, email = email, password = password, roles = arrayListOf(role))

    constructor() : this(0L, "", "", "", listOf())
}