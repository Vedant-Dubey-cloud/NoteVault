package com.example.NoteVault.Entity;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.validation.constraints.NotBlank;

@Document("Users")
@Data
public class User {

    @Id
    private ObjectId id;

    @Indexed(unique=true)
    @NotBlank
    private String username;

    private String passwordHash;
}
