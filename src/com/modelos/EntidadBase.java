package com.modelos;

import java.util.UUID;

public class EntidadBase {
    private UUID id;

    public EntidadBase() {
        id = UUID.randomUUID();
    }
    
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
    
    
}
