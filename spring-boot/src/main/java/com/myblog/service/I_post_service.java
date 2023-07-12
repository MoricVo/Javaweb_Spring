package com.myblog.service;

import com.myblog.dto.post_dto;

public interface I_post_service {
post_dto save(post_dto post_Dto);
post_dto update(post_dto Dto);
void delete (int ids[]);
}
