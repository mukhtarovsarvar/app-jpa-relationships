package uz.pdp.appjparelationships.payload;

import lombok.Data;

@Data
public class StudentDto {
    private String firstName, lastName;
    private Integer addressId, groupId;
}
