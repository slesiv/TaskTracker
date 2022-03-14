package org.example.services.all;

import org.example.dto.all.ReleaseDto;
import org.example.entities.all.Release;
import org.example.mappers.all.ReleaseMapper;
import org.example.repositories.all.ReleaseRepository;
import org.example.services.CommonServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ReleaseService extends CommonServiceImpl<Release, ReleaseDto> {
    public ReleaseService(ReleaseMapper mapper, ReleaseRepository repository) {
        super(mapper, repository);
    }
}
