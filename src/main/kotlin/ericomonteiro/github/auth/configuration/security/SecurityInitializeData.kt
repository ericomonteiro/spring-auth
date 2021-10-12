package ericomonteiro.github.auth.configuration.security

import ericomonteiro.github.auth.model.security.Role
import ericomonteiro.github.auth.model.security.User
import ericomonteiro.github.auth.repository.security.UserRepository
import org.springframework.context.ApplicationListener
import org.springframework.context.event.ContextRefreshedEvent
import org.springframework.stereotype.Component

@Component
class SecurityInitializeData(
    val userRepository: UserRepository,
): ApplicationListener<ContextRefreshedEvent> {
    override fun onApplicationEvent(event: ContextRefreshedEvent) {

        if (userRepository.count() == 0L) {
            val adminRole = Role("admin")
            val adminUser = User("admin", "admin@mail.com", "123456", adminRole)
            userRepository.save(adminUser)
        }
    }
}