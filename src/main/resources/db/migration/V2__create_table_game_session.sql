CREATE TABLE game_session (
  id BIGSERIAL PRIMARY KEY,
  session_date TIMESTAMP NOT NULL,
  duration DOUBLE PRECISION NOT NULL,
  annotation VARCHAR (500),
  game_id BIGINT NOT NULL,
  FOREIGN KEY (game_id) REFERENCES game(id)
);