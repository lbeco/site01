package api.response;

import constant.JsonModule;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse extends JsonModule {
    private String result;
}
