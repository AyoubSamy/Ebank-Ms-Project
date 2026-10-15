package net.ayoub.customerservice.dto;

import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class CustomerDTO {
    private String name;
    private String email;
}
