package ec.clicka.springboot.myfirstwebapp.todo;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@ToString
public class Todo {

    private int id;

    private String username;

    @Size(min = 10, message = "Enter at least 10 characters")
    private String description;

    private LocalDate targetDate;

    private boolean done;

}
