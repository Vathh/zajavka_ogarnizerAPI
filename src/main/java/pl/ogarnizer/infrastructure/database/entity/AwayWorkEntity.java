package pl.ogarnizer.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode(of = "awayWorkId")
@ToString(of = {"awayWorkId", "createdDate", "description", "place", "device"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ogarnizer_away_work")
public class AwayWorkEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "away_work_id")
    private Integer awayWorkId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "created_by_user_id")
    private UserEntity creatingUser;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "priority_id")
    private PriorityEntity priority;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private ClientEntity client;

    @Column(name = "description")
    private String description;

    @Column(name = "place")
    private String place;

    @Column(name = "device")
    private String device;

    @Column(name = "additional_info")
    private String additionalInfo;

    @Column(name = "update_info")
    private String updateInfo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stage_id")
    private StageEntity stage;
}
