package org.example.services.all;

import org.example.mappers.all.RoleMapper;
import org.example.repositories.all.RoleRepository;
import org.example.services.AbstractServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends AbstractServiceImpl {

    public RoleServiceImpl(RoleMapper mapper, RoleRepository repository) {
        super(mapper, repository);
    }
}
