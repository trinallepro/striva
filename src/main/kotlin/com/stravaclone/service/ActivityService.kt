package main.kotlin.com.stravaclone.service

import main.kotlin.com.stravaclone.model.Activity
import main.kotlin.com.stravaclone.repository.ActivityRepository
import org.springframework.stereotype.Service

@Service
class ActivityService(private val activityRepository: ActivityRepository) {
    fun saveActivity(activity: Activity): Activity = activityRepository.save(activity)

    fun getUserActivities(userId: Long): List<Activity> = activityRepository.findByUserId(userId)

    // Other methods
}