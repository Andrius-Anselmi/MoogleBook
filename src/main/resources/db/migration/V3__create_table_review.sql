CREATE TABLE review (
    id BIGSERIAL PRIMARY KEY,
    rating INTEGER NOT NULL,
    review TEXT NOT NULL,
    date_review TIMESTAMP NOT NULL,
    game_id BIGINT UNIQUE NOT NULL,
    FOREIGN KEY (game_id) REFERENCES game(id)
);