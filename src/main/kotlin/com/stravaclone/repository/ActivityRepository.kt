package main.kotlin.com.stravaclone.repository

import main.kotlin.com.stravaclone.model.Activity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ActivityRepository : JpaRepository<Activity, Long> {
    fun findByUserId(userId: Long): List<Activity>
}