package newfeatures.streamAPI;

import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Person {

    private Long id;
    private String name;
    private Integer age;
    private LocalDateTime createdAt;

}
