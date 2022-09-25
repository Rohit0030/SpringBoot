package SpringBoot.demo.service;

import SpringBoot.demo.repository.AppFlowRepo;
import jdk.internal.dynalink.beans.StaticClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class AppFlowService {
    @Autowired
    AppFlowRepo repo;
    public String appFlow(){
        return repo.appFlow();
    }
}
