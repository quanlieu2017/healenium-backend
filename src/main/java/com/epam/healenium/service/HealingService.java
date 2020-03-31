package com.epam.healenium.service;

import com.epam.healenium.model.dto.HealingRequestDto;
import com.epam.healenium.model.dto.HealingResultDto;
import com.epam.healenium.model.dto.RequestDto;
import com.epam.healenium.model.dto.SelectorRequestDto;
import com.epam.healenium.treecomparing.Node;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Set;

public interface HealingService {

    /**
     * Healing attempt of given target selector in presented page source
     * @param dto
     * @param sessionId
     * @return
     */
    void saveHealing(HealingRequestDto dto, MultipartFile screenshot, String sessionId);

    /**
     * Store selector
     * @param request
     */
    void saveSelector(SelectorRequestDto request);

    /**
     *
     * @param dto
     * @return
     */
    List<Node> getSelectorPath(RequestDto dto);

    /**
     * Search for stored healing results
     * @param dto
     * @return
     */
    Set<HealingResultDto> getHealingResults(RequestDto dto);

}