package main.kotlin.com.stravaclone.controller

import com.stravaclone.model.User
import com.stravaclone.service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/users")
class UserController(private val userService: UserService) {

    @PostMapping("/register")
    fun registerUser(@RequestBody user: User): ResponseEntity<User> {
        val registeredUser = userService.registerUser(user)
        return ResponseEntity.ok(registeredUser)
    }

    // Other endpoints
}