package main.kotlin.com.stravaclone

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StravaCloneApplication

fun main(args: Array<String>) {
    runApplication<StravaCloneApplication>(*args)
}