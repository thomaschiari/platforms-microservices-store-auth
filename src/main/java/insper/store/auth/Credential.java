package insper.store.auth;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder 
@Accessors(fluent = true, chain = true)
public record Credential(
    String email,
    String password
) { }
