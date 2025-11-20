package com.jupitters.universalpetcare.service.appointment;

import com.jupitters.universalpetcare.model.Appointment;
import com.jupitters.universalpetcare.request.UpdateAppointmentRequest;

import java.util.List;

public interface IAppointmentService {
    Appointment createAppointment(Appointment appointment, Long sender, Long recipient);
    List<Appointment> getAllAppointments(Appointment appointment);
    Appointment updateAppointment(Long id, UpdateAppointmentRequest request);
    void deleteAppointment(Long id);
    Appointment getAppointmentById(Long id);
    Appointment getAppointmentByNo(String appointmentNo);

}
