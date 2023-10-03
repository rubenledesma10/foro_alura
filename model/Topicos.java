
package com.example.foroAlura.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Topicos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String fechaCreacion;
    @NotBlank
    private String estatusTopico;
    @NotBlank
    private String autor;
    @NotBlank
    private String curso;
    @NotBlank
    @Column(unique = true)
    private String titulo;
    @NotBlank
    @Column(unique = true)
    private String mensaje;
    
}
