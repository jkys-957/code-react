package me.jkys.mallapi.controller;

import java.util.List;
import java.util.Map;

import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import me.jkys.mallapi.dto.PageRequestDTO;
import me.jkys.mallapi.dto.PageResponseDTO;
import me.jkys.mallapi.dto.ProductDTO;
import me.jkys.mallapi.service.ProductService;
import me.jkys.mallapi.util.CustomFileUtil;

@RestController
@RequiredArgsConstructor
@Log4j2
@RequestMapping("/api/products")
public class ProductController {

  private final CustomFileUtil fileUtil;
  private final ProductService productService;   // ProductService 주입

  @PostMapping("/")
  public Map<String, Long> register(ProductDTO productDTO) {
    log.info("register : " + productDTO);

    List<MultipartFile> files = productDTO.getFiles();
    List<String> uploadFileNames = fileUtil.saveFiles(files);

    productDTO.setUploadFileNames(uploadFileNames);

    log.info(uploadFileNames);

    // 서비스 호출
    Long pno = productService.register(productDTO);

    return Map.of("result", pno);
  }

  @GetMapping("/view/{fileName}")
  public ResponseEntity<Resource> viewFileGET(@PathVariable String fileName) {
  
    log.info("Requested fileName: " + fileName);  // 로그로 파일명을 출력

    ResponseEntity<Resource> response = fileUtil.getFile(fileName);
    log.info("Response: " + response.getStatusCode());
    return fileUtil.getFile(fileName);
  }

  @GetMapping("/list")
  public PageResponseDTO<ProductDTO> list(PageRequestDTO pageRequestDTO) {

    log.info("list ------------------------" + pageRequestDTO);
    
    return productService.getList(pageRequestDTO);
  }

}
