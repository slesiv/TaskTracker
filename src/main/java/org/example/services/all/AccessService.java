package org.example.services.all;

import org.example.dto.all.AccessDto;
import org.example.entities.all.Access;
import org.example.mappers.all.AccessMapper;
import org.example.repositories.all.AccessRepository;
import org.example.services.CommonServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class AccessService extends CommonServiceImpl<Access, AccessDto> {
    public AccessService(AccessMapper mapper, AccessRepository repository) {
        super(mapper, repository);
    }
}
