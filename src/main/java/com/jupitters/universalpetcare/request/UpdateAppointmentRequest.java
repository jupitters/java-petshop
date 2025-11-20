package com.jupitters.universalpetcare.request;

import com.jupitters.universalpetcare.model.User;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class UpdateAppointmentRequest {
    private String reason;
    private LocalDate date;
    private LocalTime time;
    private String appointmentNo;
    private LocalDate createdAt;
    private User patient;
    private User veterinarian;
}
