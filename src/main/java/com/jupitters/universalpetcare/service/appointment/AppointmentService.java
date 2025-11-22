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
    public Appointment createAppointment(Appointment appointment, Long senderId, Long recipientId) {
        Optional<User> sender = userRepository.findById(senderId);
        Optional<User> recipient = userRepository.findById(recipientId);
        if (sender.isPresent() && recipient.isPresent()) {
            appointment.setPatient(sender.get());
            appointment.setVeterinarian(recipient.get());
            appointment.setAppointmentNo();
            appointment.setStatus(AppointmentStatus.WAITING_FOR_APPROVAL);
            return appointmentRepository.save(appointment);
        }
        return null;
    }

    @Override
    public List<Appointment> getAllAppointments(Appointment appointment) {
        return List.of();
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
