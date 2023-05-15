package kz.springboot.springtaskfirst.db;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Items {
    Long id;
    String name;
    String image;
    String desc;
    double price;


}
