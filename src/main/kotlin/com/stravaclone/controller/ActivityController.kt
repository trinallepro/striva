package main.kotlin.com.stravaclone.controller

import com.stravaclone.model.Activity
import com.stravaclone.service.ActivityService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/activities")
class ActivityController(private val activityService: ActivityService) {

    @PostMapping
    fun createActivity(@RequestBody activity: Activity): ResponseEntity<Activity> {
        val savedActivity = activityService.saveActivity(activity)
        return ResponseEntity.ok(savedActivity)
    }

    @GetMapping("/user/{userId}")
    fun getUserActivities(@PathVariable userId: Long): ResponseEntity<List<Activity>> {
        val activities = activityService.getUserActivities(userId)
        return ResponseEntity.ok(activities)
    }

    // Other endpoints
}