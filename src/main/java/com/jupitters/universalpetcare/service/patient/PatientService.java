package com.jupitters.universalpetcare.service.patient;

import com.jupitters.universalpetcare.model.Patient;
import com.jupitters.universalpetcare.model.User;
import com.jupitters.universalpetcare.request.CreateUserRequest;
import com.jupitters.universalpetcare.service.user.UserAttributesMapper;
import org.springframework.stereotype.Service;

@Service
public class PatientService implements IPatientService {
    private UserAttributesMapper userAttributesMapper;

    @Override
    public User createPatient(CreateUserRequest request) {
        Patient patient = new Patient();
        userAttributesMapper.setCommonAttributes(request, patient);
        return patient;
    }
}
