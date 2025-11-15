package com.jupitters.universalpetcare.service.patient;

import com.jupitters.universalpetcare.model.Patient;
import com.jupitters.universalpetcare.model.User;
import com.jupitters.universalpetcare.repository.PatientRepository;
import com.jupitters.universalpetcare.request.CreateUserRequest;
import com.jupitters.universalpetcare.service.user.UserAttributesMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientService implements IPatientService {
    private final UserAttributesMapper userAttributesMapper;
    private final PatientRepository patientRepository;

    @Override
    public User createPatient(CreateUserRequest request) {
        Patient patient = new Patient();
        userAttributesMapper.setCommonAttributes(request, patient);
        return patientRepository.save(patient);
    }
}
