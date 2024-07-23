package org.Edu.navigator.service;

import org.Edu.navigator.dto.request.CoordinatorRequestDto;
import org.Edu.navigator.model.Coordinator;

import java.util.List;

public interface CoordinatorService {
    public Coordinator updateCoordinator(Long id , CoordinatorRequestDto coordinatorRequestDto);

    public void deleteCoordinator(Long id);

    Coordinator createCoordinator(CoordinatorRequestDto coordinatorRequestDto);

    Coordinator getCoordinator(Long id);

    List<Coordinator >GetAllCoordinator();

}
