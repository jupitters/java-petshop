package com.jupitters.universalpetcare.service.appointment;

import com.jupitters.universalpetcare.enums.AppointmentStatus;
import com.jupitters.universalpetcare.exceptions.ResourceNotFoundException;
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
        return appointmentRepository.findAll();
    }

    @Override
    public Appointment updateAppointment(Long id, UpdateAppointmentRequest request) {
        return null;
    }

    @Override
    public void deleteAppointment(Long id) {
        appointmentRepository.findById(id)
                .ifPresentOrElse(appointmentRepository::delete,
                        () -> {
                            new ResourceNotFoundException("Appointment not found!");
                        });
    }

    @Override
    public Appointment getAppointmentById(Long id) {
        return appointmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Appointment not found!"));
    }

    @Override
    public Appointment getAppointmentByNo(String appointmentNo) {
        return appointmentRepository.findByAppointmentNo(appointmentNo);
    }
}
