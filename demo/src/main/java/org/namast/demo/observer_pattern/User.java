package org.namast.demo.observer_pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class User {
    private String email;
    private String ip;
    private LoginStatus status;
}