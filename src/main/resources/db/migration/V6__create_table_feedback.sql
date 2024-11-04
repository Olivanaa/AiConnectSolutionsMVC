CREATE TABLE IF NOT EXISTS feedback (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    avaliacao VARCHAR(255) NOT NULL,
    comentario VARCHAR(300),
    dtFeedBack DATE NOT NULL,
    cliente_id BIGINT,

    FOREIGN KEY (cliente_id) REFERENCES Cliente(id)

);