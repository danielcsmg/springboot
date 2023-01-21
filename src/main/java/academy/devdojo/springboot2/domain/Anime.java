package academy.devdojo.springboot2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Anime {
    private Long id;
//    @JsonProperty("jsonName") <- Use em caso de nome do aatributo diferente do Json
    private String name;
}
