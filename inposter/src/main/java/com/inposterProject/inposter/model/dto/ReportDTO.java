package com.inposterProject.inposter.model.dto;

import com.inposterProject.inposter.model.entity.Report;
import com.inposterProject.inposter.model.entity.ReportReason;
import com.inposterProject.inposter.model.entity.User;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ReportDTO {

    private Long id;
    @NotNull
    private ReportReason reportReason;
    @NotNull
    private LocalDate timestamp;

    @NotNull
    private User byUser;
    private Boolean accepted;

    public ReportDTO (Report report) {
        this.id = report.getId();
        this.reportReason = report.getReportReason();
        this.timestamp = report.getTimestamp();
        this.byUser = report.getByUser();
        this.accepted = report.getAccepted();
    }

    public ReportDTO () {}

}
