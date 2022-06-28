package org.petgo.jing_yuan.service;

import java.util.List;
import java.util.Optional;

import org.petgo.jing_yuan.model.Application;
import org.petgo.jing_yuan.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {
     @Autowired
     private ApplicationRepository applicationRepository;

     public Application getApplicationById(long applicationId) {
        Optional<Application> foundApplication = applicationRepository.findById(applicationId);
        Application application = null;
        if (foundApplication.isPresent()) {
            application = foundApplication.get();
        } else {
            throw new RuntimeException("Application cannot be found by id::" + applicationId);
        }
        return application;
        
     }

     public List<Application> getAllApplications() {
         return applicationRepository.findAll();

     }
     
     public void addApplication(Application application) {
         applicationRepository.save(application);

         }

         public void updateApplication(long id, Application application) {
        Optional<Application> applicationData = applicationRepository.findById(id);

        if (applicationData.isPresent()) {
            Application _application = applicationData.get();
            _application.setId(application.getId());
            _application.setUser(application.getUser());
            _application.setPet(application.getPet());
            applicationRepository.save(_application);
        }
    }
   
}
