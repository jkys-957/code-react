package me.jkys.mallapi.service;

import jakarta.transaction.Transactional;
import me.jkys.mallapi.dto.PageRequestDTO;
import me.jkys.mallapi.dto.PageResponseDTO;
import me.jkys.mallapi.dto.ProductDTO;

@Transactional
public interface ProductService {

  PageResponseDTO<ProductDTO> getList(PageRequestDTO pageRequestDTO);

  Long register(ProductDTO productDTO);

  // 5.4.3 조회 기능의 처리
  // 조회 기능은 등록 기능과 반대로 Product와 List<ProductImage>로 구성된 데이터를 하나의 ProductDTO로 변환해야 한다.
    // <서비스 조회 기능의 처리>
      // 파라미터로 상품의 번호(pno)를 받고, 리턴 타입은 Product 타입인 get()을 정의한다.
  ProductDTO get(Long pno);

  void modify(ProductDTO productDTO);

  void remove(Long pno);

}
