package org.example.services.all;

import org.example.mappers.all.RoleMapper;
import org.example.repositories.all.RoleRepository;
import org.example.services.CommonServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends CommonServiceImpl {

    public RoleServiceImpl(RoleMapper mapper, RoleRepository repository) {
        super(mapper, repository);
    }
}
