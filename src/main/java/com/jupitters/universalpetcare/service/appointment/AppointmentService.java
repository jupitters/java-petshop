package com.jupitters.universalpetcare.service.appointment;

import com.jupitters.universalpetcare.model.Appointment;

import java.util.List;

public class AppointmentService implements IAppointmentService {
    @Override
    public Appointment createAppointment(Appointment appointment, Long sender, Long recipient) {
        return null;
    }

    @Override
    public List<Appointment> getAllAppointments(Appointment appointment) {
        return List.of();
    }

    @Override
    public Appointment updateAppointment(Long id, UpdateAppointmentRequest request) {
        return null;
    }

    @Override
    public void deleteAppointment(Long id) {

    }

    @Override
    public Appointment getAppointmentById(Long id) {
        return null;
    }

    @Override
    public Appointment getAppointmentByNo(String appointmentNo) {
        return null;
    }
}
