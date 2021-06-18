package api.response;

import constant.JsonModule;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArticleResponse extends JsonModule {
    String title;

    String main;
}
