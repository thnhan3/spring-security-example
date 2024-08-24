package com.example.demo.payload.request;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Set;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SignUpRequest {
    @NotNull
    private String username;
    @NotNull
    private String email;
    @NotNull
    private String password;

    private Set<String> role;
}
