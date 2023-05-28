package com.example.swappifyapimodel.model.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class UpdateUserDetailsDTO {
    @NonNull
    private String email;

    @NonNull
    private String oldPassword;

    @NonNull
    private String newPassword;
}