package me.jkys.mallapi.service;

import jakarta.transaction.Transactional;
import me.jkys.mallapi.dto.PageRequestDTO;
import me.jkys.mallapi.dto.PageResponseDTO;
import me.jkys.mallapi.dto.ProductDTO;

@Transactional
public interface ProductService {

  PageResponseDTO<ProductDTO> getList(PageRequestDTO pageRequestDTO);

  Long register(ProductDTO productDTO);

}
