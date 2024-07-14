package main.kotlin.com.stravaclone.service

import main.kotlin.com.stravaclone.model.User
import main.kotlin.com.stravaclone.repository.UserRepository
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository,
    private val passwordEncoder: PasswordEncoder
) {
    fun registerUser(user: User): User {
        val encodedPassword = passwordEncoder.encode(user.password)
        return userRepository.save(user.copy(password = encodedPassword))
    }

    fun findByUsername(username: String): User? = userRepository.findByUsername(username)

    // Other methods
}