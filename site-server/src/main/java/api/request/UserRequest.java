package api.request;

import constant.JsonModule;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest extends JsonModule {
    String userName;

    String passWord;
}
