package academy.devdojo.springboot2.requests;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class AnimePostRequestBody {
    @NotEmpty(message = "Anime couldn't be empty!")
    private String name;
}
