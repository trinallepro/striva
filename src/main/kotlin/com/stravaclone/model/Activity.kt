package main.kotlin.com.stravaclone.model

import javax.persistence.*
import org.locationtech.jts.geom.LineString
import java.time.LocalDateTime

@Entity
@Table(name = "activities")
data class Activity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    val user: User,

    @Column(nullable = false)
    val name: String,

    @Column(nullable = false)
    val type: String,

    @Column(columnDefinition = "geometry(LineString,4326)")
    val route: LineString?,

    val distance: Double?,
    val duration: Double?,
    val elevation: Double?,

    @Column(nullable = false)
    val startTime: LocalDateTime
)