package com.example.NoteVault.Entity;



import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document("Notes")
@Data
@NoArgsConstructor
public class Notes {
    @Id
    private ObjectId id;

    @NonNull
    private String title;
    private String content;
    private List<String> tags;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean pinned=false;
    private Boolean deleted=false;
    private ObjectId userId;
}


