package ec.clicka.springboot.myfirstwebapp.todo;

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
    private String description;
    private LocalDate targetDate;
    private boolean done;

}
