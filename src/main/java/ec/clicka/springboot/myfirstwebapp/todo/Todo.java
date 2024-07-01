package ec.clicka.springboot.myfirstwebapp.todo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Todo {

    @Id
    @GeneratedValue
    private int id;

    private String username;

    @Size(min = 10, message = "Enter at least 10 characters")
    private String description;

    private LocalDate targetDate;

    private boolean done;

}
