package com.jupitters.universalpetcare.service.patient;

import com.jupitters.universalpetcare.model.Patient;
import com.jupitters.universalpetcare.model.User;
import com.jupitters.universalpetcare.repository.PatientRepository;
import com.jupitters.universalpetcare.request.CreateUserRequest;
import com.jupitters.universalpetcare.service.user.UserAttributesMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PatientService implements IPatientService {
    private final UserAttributesMapper userAttributesMapper;
    private final PatientRepository patientRepository;

}
