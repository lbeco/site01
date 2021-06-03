package api.response;

import constant.JsonModule;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse extends JsonModule {
    private String name;

    private Integer height;

    private Date birthday;
}
