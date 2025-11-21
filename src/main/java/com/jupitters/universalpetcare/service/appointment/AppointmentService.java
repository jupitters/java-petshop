package com.jupitters.universalpetcare.service.appointment;

import com.jupitters.universalpetcare.enums.AppointmentStatus;
import com.jupitters.universalpetcare.model.Appointment;
import com.jupitters.universalpetcare.model.User;
import com.jupitters.universalpetcare.repository.AppointmentRepository;
import com.jupitters.universalpetcare.repository.UserRepository;
import com.jupitters.universalpetcare.request.UpdateAppointmentRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class AppointmentService implements IAppointmentService {
    private final AppointmentRepository appointmentRepository;
    private final UserRepository userRepository;



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
